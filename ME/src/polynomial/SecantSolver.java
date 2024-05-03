package polynomial;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double result = lower - (polynomial.evaluate(lower) * (lower - upper))
                / (polynomial.evaluate(lower) - polynomial.evaluate(upper));
        double doChenhLech = Math.abs(polynomial.evaluate(result));
        while (Math.abs(doChenhLech) > 0.001) {
            if (maxIterations-- > 0) {
                upper = lower;
                lower = result;
                result =  lower - (polynomial.evaluate(lower) * (lower - upper))
                        / (polynomial.evaluate(lower) - polynomial.evaluate(upper));
                doChenhLech = Math.abs(polynomial.evaluate(result));
            }
        }
        if (doChenhLech > 0.00001) {
            return Double.NEGATIVE_INFINITY;
        } else {
            return result;
        }
    }
}
