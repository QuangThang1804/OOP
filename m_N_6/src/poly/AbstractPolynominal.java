package poly;

public class AbstractPolynominal implements Polynominal{
    public AbstractPolynominal() {
    }

    double[] differentiate() {
        double[] arr = new double[degree() + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = coefficient(i + 1) * (i + 1);
        }
        return arr;
    }
    @Override
    public double coefficient(int index) {
        return coefficients()[index];
    }

    @Override
    public double[] coefficients() {
        return coefficients();
    }

    @Override
    public int degree() {
        int degree = 0;
        for (int i = coefficients().length - 1; i >= 0; i--) {
            if (Math.abs(coefficient(i)) < 0.001) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    @Override
    public Polynominal derivative() {
        return null;
    }

    @Override
    public double evaluate(double x) {
        double result = coefficient(degree());
        for (int i = degree() - 1; i >= 0; i--) {
            result *= x;
            result += coefficient(i);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree(); i >= 0; i--) {
            if (coefficient(i) != 0) {
                if (coefficient(i) > 0 && i != degree()) {
                    sb.append("+");
                }
                if (i == 0) {
                    sb.append(coefficient(i)).append("x^").append(i);
                } else if (i == 1) {
                    if (coefficient(i) == 1) {
                        sb.append("x");
                    } else {
                        sb.append(coefficient(i)).append("x");
                    }
                } else {
                    if (coefficient(i) == 1) {
                        sb.append("x^").append(i);
                    } else {
                        sb.append(coefficient(i)).append("x^").append(i);
                    }
                }
            }

        }
        return sb.toString();
    }
}
