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
        double[] arr = derive();
        return new ListPoly(arr);
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
}
