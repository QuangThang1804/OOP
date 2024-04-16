package poly;

public class PolynominalRootFinding {
    Polynominal poly;
    RootSolver rootSolver;

    public PolynominalRootFinding(Polynominal poly) {
        this.poly = poly;
    }

    public PolynominalRootFinding(Polynominal poly, RootSolver rootSolver) {
        this.poly = poly;
        this.rootSolver = rootSolver;
    }

    public void setPoly(Polynominal poly) {
        this.poly = poly;
    }

    public void setRootSolver(RootSolver rootSolver) {
        this.rootSolver = rootSolver;
    }

    public double solve(double num1, double num2) {
        return this.rootSolver.solve(poly, num1, num2);
    }
}
