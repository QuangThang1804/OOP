package poly;

public class NewtonRaphsonSolver implements RootSolver {
    double tolerance;
    int maxInterations;

    public NewtonRaphsonSolver(double tolerance, int maxInterations) {
        this.tolerance = tolerance;
        this.maxInterations = maxInterations;
    }

    @Override
    public double solve(Polynominal poly, double num1, double num2) {
        double result = num1 - poly.evaluate(num1) / poly.derivative().evaluate(num1);
        double doChenhLech = Math.abs(poly.evaluate(result));
        while (Math.abs(doChenhLech) > 0.000001 && (maxInterations-- > 0)) {
            num1 = result;
            result = num1 - poly.evaluate(num1) / poly.derivative().evaluate(num1);
            doChenhLech = Math.abs(poly.evaluate(result));
        }
        if (Math.abs(doChenhLech) > 0.00001) {
            return Double.NEGATIVE_INFINITY;
        } else {
            return result;
        }
    }
}
