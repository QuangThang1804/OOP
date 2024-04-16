package poly;

public class BiSectionSolver implements RootSolver{
    double tolerance;
    int maxInterations;

    public BiSectionSolver(double tolerance, int maxInterations) {
        this.tolerance = tolerance;
        this.maxInterations = maxInterations;
    }

    @Override
    public double solve(Polynominal poly, double num1, double num2) {
        double middle = (num1 + num2) / 2;
        double valueMiddle = poly.evaluate(middle);
        while (maxInterations-- > 0) {
            double tmp1 = poly.evaluate(num1);
            double tmp2 = poly.evaluate(num2);
//            if (valueMiddle == 0) {
//                return middle;
//            } else if (valueMiddle * poly.evaluate(num1) < 0) {
//                solve(poly, num1, middle);
//            } else if (valueMiddle * poly.evaluate(num2) < 0) {
//                solve(poly, middle, num2);
//            }
            if (valueMiddle == 0) {
                return middle;
            } else if (valueMiddle > 0) {
                solve(poly, num1, middle);
            } else {
                solve(poly, middle, num2);
            }
        }
        return (poly.evaluate(middle) == 0) ? middle : Double.NEGATIVE_INFINITY;
    }
}
