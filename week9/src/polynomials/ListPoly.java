package polynomials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        List<Double> myList = new ArrayList<>();
        for (double value : coeffs) {
            myList.add(value);
        }
        coefficients = myList;
    }

    @Override
    public int degree() {
        int degree = -1;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            if (coefficients.get(i) != 0) {
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
            arr[i] = coefficients.get(i + 1) * (i + 1);
        }
        ListPoly newArrPoly = new ListPoly(arr);
        return (Poly) newArrPoly;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] arr = new double[degree() + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = coefficients.get(i);
        }
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        for (int i = this.degree(); i >= 0; i--) {
            if (coefficients.get(i) != 0) {
                if (coefficients.get(i) > 0 && i != this.degree()) {
                    polynominalStr.append("+");
                }

                if (i == 0) {
                    polynominalStr.append(coefficients.get(i));
                } else if (i == 1) {
                    polynominalStr.append(coefficients.get(i)).append("x");
                } else {
                    polynominalStr.append(coefficients.get(i)).append("x^").append(i);
                }
            }
        }
        return polynominalStr.toString();
    }
}
