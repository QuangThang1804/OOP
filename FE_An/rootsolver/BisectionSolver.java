package hus.FE_An.rootsolver;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double middle = (lower + upper) / 2;
        double valueMiddle = function.evaluate(middle);
        while (maxIterations-- > 0) {
            double tmp1 = function.evaluate(lower);
            double tmp2 = function.evaluate(upper);
            if (valueMiddle == 0) {
                return middle;
            } else if (valueMiddle > 0) {
                solve(function, lower, middle);
            } else {
                solve(function, middle, upper);
            }
        }
        return (function.evaluate(middle) == 0) ? middle : Double.NEGATIVE_INFINITY;
    }
}
