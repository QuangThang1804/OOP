package polynomial;

import java.util.ArrayList;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     *
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n0 = (int) (Math.random() * 9) + 1;
//        int n0 = 4;
        double integration2n0 = integrate(poly, lower, upper, 2 * n0);
        double integrationn0 = integrate(poly, lower, upper, n0);
        while (Math.abs(integration2n0 - integrationn0) / 3 > this.precision && maxIterations-- > 0) {
            n0 = 2 * n0;
            integration2n0 = integrate(poly, lower, upper, 2 * n0);
            integrationn0 = integrate(poly, lower, upper, n0);
        }
        return integrationn0;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     *
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double h = (upper - lower) / numOfSubIntervals;
        ArrayList<Double> valueOfPoly = new ArrayList<>();
        double x0 = lower;
        int i = 1;
        while (x0 + i * h < upper) {
            valueOfPoly.add(poly.evaluate(x0 + i * h));
            i++;
        }
        double result = 0;
        for (double value: valueOfPoly) {
            result += value;
        }
        result = h / 2 * (poly.evaluate(lower) + poly.evaluate(upper) + result * 2);
        return result;
    }

}
