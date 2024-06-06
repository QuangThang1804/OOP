package hus.FE_An.rootsolver;

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
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
//        double result = lower - function.evaluate(lower) / function.derivative(lower);
//        double doChenhLech = Math.abs(function.evaluate(result));
//        while (Math.abs(doChenhLech) > 0.000001 && (maxIterations-- > 0)) {
//            lower = result;
//            result = lower - function.evaluate(lower) / function.derivative(lower);
//            doChenhLech = Math.abs(function.evaluate(result));
//        }
//        if (Math.abs(doChenhLech) > 0.00001) {
//            return Double.NEGATIVE_INFINITY;
//        } else {
//            return result;
//        }
        double x = 0;
        double f = 0, f_prime = 0, x_pre = lower;

        for (int i = 0; i < this.maxIterations; i++) {
            f = function.evaluate(x_pre);
            f_prime = function.derivative(x_pre);
            if (Math.abs(f_prime) == 0) {
                break;
            }
            x = x_pre - f / f_prime;
            if (Math.abs(x - x_pre) <= tolerance) {
                return x;
            }
            x_pre = x;

        }
        return x;
    }
}
