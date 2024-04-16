package poly;

public interface Polynominal {
    double coefficient(int index);
    double[] coefficients();
    int degree();
    Polynominal derivative();
    double evaluate(double x);
}
