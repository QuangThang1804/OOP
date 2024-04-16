package poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPolynominal extends AbstractPolynominal {
    List<Double> coefficients;
    public ListPolynominal() {
        this.coefficients = new ArrayList<>();
    }

    public ListPolynominal append(double x) {
        this.coefficients.add(x);
        return this;
    }

    @Override
    public double coefficient(int index) {
        return this.coefficients.get(index);
    }

    @Override
    public double[] coefficients() {
        double[] arr = new double[this.coefficients.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = this.coefficients.get(i);
        }
        return arr;
    }

    @Override
    public int degree() {
        int degree = 0;
        for (int i = this.coefficients.size() - 1; i >= 0; i--) {
            if (coefficient(i) != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    @Override
    public Polynominal derivative() {
        ListPolynominal newListPoly = new ListPolynominal();
        List<Double> listDerivative = new ArrayList<>();
        for (double num: differentiate()) {
            listDerivative.add(num);
        }
        newListPoly.coefficients = listDerivative;
        return newListPoly;
    }

    @Override
    public double evaluate(double x) {
        double result = this.coefficients.get(degree());
        for (int i = degree() - 1; i >= 0; i--) {
            result *= x;
            result += this.coefficients.get(i);
        }
        return result;
    }
    public ListPolynominal plus(ListPolynominal another) {
        int maxLength = Math.max(this.coefficients.size(), another.coefficients.size());
        int minLength = Math.min(this.coefficients.size(), another.coefficients.size());
        List<Double> listPlus = new ArrayList<>();
        for (int i = 0; i < minLength; i++) {
            listPlus.add(this.coefficients.get(i) + another.coefficients.get(i));
        }

        if (maxLength == this.coefficients.size()) {
            for (int i = minLength; i < maxLength; i++) {
                listPlus.add(i,this.coefficient(i));
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                listPlus.set(i, another.coefficient(i));
            }
        }
        this.coefficients = listPlus;
        return this;
    }

    public ListPolynominal minus(ListPolynominal another) {
        int maxLength = Math.max(this.coefficients.size(), another.coefficients.size());
        int minLength = Math.min(this.coefficients.size(), another.coefficients.size());
        List<Double> listMinus = new ArrayList<>();
        for (int i = 0; i < minLength; i++) {
            listMinus.add(i, this.coefficients.get(i) - another.coefficients.get(i));
        }

        if (maxLength == this.coefficients.size()) {
            for (int i = minLength; i < maxLength; i++) {
                listMinus.add(i, this.coefficient(i));
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                listMinus.add(i, -another.coefficient(i));
            }
        }
        this.coefficients = listMinus;
        return this;
    }

    public ListPolynominal multiply(ListPolynominal another) {
        int newLengthCoeffs = this.coefficients.size() + another.coefficients.size() - 1;
        double[] newCoeffs = new double[newLengthCoeffs];
        List<Double> listMutiply = new ArrayList<>();
        int index = 0;
        while (index < newLengthCoeffs) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficients.size() - 1 && fid <= another.coefficients.size() - 1) {
                    newCoeffs[index] += coefficients.get(lid) * another.coefficients.get(fid);
                }
            }
            index++;
        }

        for (double num: newCoeffs) {
            listMutiply.add(num);
        }
        this.coefficients = listMutiply;
        return this;
    }

    public ListPolynominal set(double x, int index) {
        this.coefficients.set(index, x);
        return this;
    }
}
