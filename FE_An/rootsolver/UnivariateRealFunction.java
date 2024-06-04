package hus.FE_An.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    double [] polynominal;

    public UnivariateRealFunction() {
    }

    public UnivariateRealFunction(double[] polynominal) {
        this.polynominal = polynominal;
    }

    @Override
    public double evaluate(double x) {
        return MyMath.sin(x) * x - 3;
    }

    @Override
    public double derivative(double x) {
        return MyMath.sin(x) + x * MyMath.cos(x);
    }
}
