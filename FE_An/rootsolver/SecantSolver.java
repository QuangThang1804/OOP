package hus.FE_An.rootsolver;

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
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper]
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double result = lower - (function.evaluate(lower) * (lower - upper))
                / (function.evaluate(lower) - function.evaluate(upper));
        double difference = Math.abs(function.evaluate(result));
        while (Math.abs(difference) > this.tolerance) {
            if (maxIterations-- > 0) {
                upper = lower;
                lower = result;
                result =  lower - (function.evaluate(lower) * (lower - upper))
                        / (function.evaluate(lower) - function.evaluate(upper));
                difference = Math.abs(function.evaluate(result));
            }
        }
        if (difference > 0.00001) {
            return Double.NEGATIVE_INFINITY;
        } else {
            return result;
        }
//        double x = 0;
//        for (int i = 0; i < maxIterations; i++) {
//            x = upper - function.evaluate(upper) * (upper - lower)
//                    / (function.evaluate(upper) - function.evaluate(lower));
//            if (Math.abs(x) < this.tolerance) {
//                break;
//            }
//            lower = upper;
//            upper = x;
//        }
//        return x;
    }
}
