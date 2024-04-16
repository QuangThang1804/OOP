package polynomials;

import java.util.ArrayList;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        super();
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
        double[] arr = derive();
        return new ArrayPoly(arr);
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
}
