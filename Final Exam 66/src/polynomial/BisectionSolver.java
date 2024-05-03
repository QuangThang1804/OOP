package polynomial;

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
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double middle = (lower + upper) / 2;
        double valueMiddle = polynomial.evaluate(middle);
        while (maxIterations-- > 0) {
            double tmp1 = polynomial.evaluate(lower);
            double tmp2 = polynomial.evaluate(upper);
            if (valueMiddle == 0) {
                return middle;
            } else if (valueMiddle > 0) {
                solve(polynomial, lower, middle);
            } else {
                solve(polynomial, middle, upper);
            }
        }
        return (polynomial.evaluate(middle) == 0) ? middle : Double.NEGATIVE_INFINITY;
    }
}
