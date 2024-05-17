package hus.Week12.integration;

import java.util.ArrayList;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n0 = (int) (Math.random() * 9) + 1;
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
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double h = (upper - lower) / (2 * numOfSubIntervals);
        ArrayList<Double> valueOfPolyWithOddNum = new ArrayList<>();
        ArrayList<Double> valueOfPolyWithEvenNum = new ArrayList<>();
        int i = 1;
        while (lower + i * h < upper) {
            if (i % 2 == 0) {
                valueOfPolyWithEvenNum.add(poly.evaluate(lower + i * h));
            } else {
                valueOfPolyWithOddNum.add(poly.evaluate(lower + i * h));
            }
            i++;
        }
        double sumOfOdd = 0;
        double sumOfEven = 0;
        for (double value : valueOfPolyWithEvenNum) {
            sumOfEven += value;
        }
        for (double value : valueOfPolyWithOddNum) {
            sumOfOdd += value;
        }
        return h / 3 * (poly.evaluate(lower) + poly.evaluate(upper)
                + 4 * sumOfOdd + 2 * sumOfEven);
    }
}
