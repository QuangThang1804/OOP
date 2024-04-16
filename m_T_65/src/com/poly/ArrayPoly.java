package com.poly;

public class ArrayPoly extends AbstractPoly{
    private int[] coefficients;

    public ArrayPoly(int[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int coefficient(int i) {
        return this.coefficients[i];
    }

    @Override
    public int[] coefficients() {
        return this.coefficients;
    }

    @Override
    public Poly derivative() {
        reduce();
        int[] arr = differentiate();
        return new ArrayPoly(arr);
    }

    @Override
    public double evaluate(double x) {
        return super.evaluate(x);
    }

    public String type() {
        return "Array Poly";
    }

    private void reduce() {
        for (int i = this.coefficients.length - 1; i >= 0; i--) {
            if (this.coefficients[i] != 0) {
                this.degree = i;
                break;
            }
        }
    }

    public ArrayPoly plus(ArrayPoly another) {
        int maxLength = Math.max(coefficients().length, another.coefficients.length);
        int minLength = Math.min(coefficients().length, another.coefficients.length);

        int[] newCoeffs = new int[maxLength];

        for (int i = 0; i < minLength; i++) {
            newCoeffs[i] = coefficient(i) + another.coefficient(i);
        }

        if (maxLength == coefficients().length) {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = coefficient(i);
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = another.coefficient(i);
            }
        }
        this.coefficients = newCoeffs;
        return this;
    }

    public ArrayPoly minus(ArrayPoly another) {
        int maxLength = Math.max(coefficients().length, another.coefficients.length);
        int minLength = Math.min(coefficients().length, another.coefficients.length);

        int[] newCoeffs = new int[maxLength];

        for (int i = 0; i < minLength; i++) {
            newCoeffs[i] = coefficient(i) - another.coefficient(i);
        }

        if (maxLength == coefficients().length) {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = coefficient(i);
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = -another.coefficient(i);
            }
        }
        this.coefficients = newCoeffs;
        return this;
    }

    public ArrayPoly times(ArrayPoly another) {
        int newLengthCoeffs = this.coefficients.length + another.coefficients.length - 1;
        int[] newCoeffs = new int[newLengthCoeffs];
        int index = 0;
        while (index < newLengthCoeffs) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficients.length - 1 && fid <= another.coefficients.length - 1) {
                    newCoeffs[index] += coefficients[lid] * another.coefficients[fid];
                }
            }
            index++;
        }
        this.coefficients = newCoeffs;
        return this;
    }
}
