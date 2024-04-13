package polynomials;

import java.util.ArrayList;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        int degree = -1;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    @Override
    public Poly derivative() {
        double[] arr = new double[degree()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = coefficients[i + 1] * (i + 1);
        }
        ArrayPoly newArrPoly = new ArrayPoly(arr);
        return (Poly) newArrPoly;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        double[] arr = new double[degree() + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = coefficients[i];
        }
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        for (int i = this.degree(); i >= 0; i--) {
            if (coefficients[i] != 0) {
                if (coefficients[i] > 0 && i != this.degree()) {
                    polynominalStr.append("+");
                }

                if (i == 0) {
                    polynominalStr.append(coefficients[i]);
                } else if (i == 1) {
                    polynominalStr.append(coefficients[i]).append("x");
                } else {
                    polynominalStr.append(coefficients[i]).append("x^").append(i);
                }
            }
        }
        return polynominalStr.toString();
    }
}
