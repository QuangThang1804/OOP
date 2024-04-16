package poly;

public class SecantSolver implements RootSolver{
    double tolerance;
    int maxInterations;

    public SecantSolver(double tolerance, int maxInterations) {
        this.tolerance = tolerance;
        this.maxInterations = maxInterations;
    }

    @Override
    public double solve(Polynominal poly, double num1, double num2) {
        double result = num1 - (poly.evaluate(num1) * (num1 - num2))
                / (poly.evaluate(num1) - poly.evaluate(num2));
        double doChenhLech = Math.abs(poly.evaluate(result));
        while (Math.abs(doChenhLech) > 0.001) {
            if (maxInterations-- > 0) {
                num2 = num1;
                num1 = result;
                result =  num1 - (poly.evaluate(num1) * (num1 - num2))
                        / (poly.evaluate(num1) - poly.evaluate(num2));
                doChenhLech = Math.abs(poly.evaluate(result));
            }
        }
        if (doChenhLech > 0.00001) {
            return Double.NEGATIVE_INFINITY;
        } else {
            return result;
        }
    }
}
