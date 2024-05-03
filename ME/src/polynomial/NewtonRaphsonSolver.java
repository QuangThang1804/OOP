package polynomial;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double result = lower - polynomial.evaluate(lower) / polynomial.derivative().evaluate(lower);
        double doChenhLech = Math.abs(polynomial.evaluate(result));
        while (Math.abs(doChenhLech) > 0.000001 && (maxIterations-- > 0)) {
            lower = result;
            result = lower - polynomial.evaluate(lower) / polynomial.derivative().evaluate(lower);
            doChenhLech = Math.abs(polynomial.evaluate(result));
        }
        if (Math.abs(doChenhLech) > 0.00001) {
            return Double.NEGATIVE_INFINITY;
        } else {
            return result;
        }
    }
}
