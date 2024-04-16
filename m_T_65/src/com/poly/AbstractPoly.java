package com.poly;

public abstract class AbstractPoly implements Poly{
    protected int degree;

    public AbstractPoly() {
    }

    @Override
    public int degree() {
        for (int i = coefficients().length - 1; i >= 0; i--) {
            if (this.coefficient(i) != 0) {
                this.degree = i;
                break;
            }
        }
        return this.degree;
    }

    int[] differentiate() {
        if (this.degree >= 1) {
            int[] arr = new int[this.degree];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = coefficient(i + 1) * (i + 1);
            }
            return arr;
        } else {
            int[] arr = {0};
            return arr;
        }
    }

    public boolean equals(Poly o) {
        boolean isEquals = true;
        if (this.degree() != o.degree()) {
            isEquals = false;
        } else if (this.coefficients() == null || o.coefficients() == null) {
            isEquals = false;
        } else {
            for (int i = 0; i <= this.degree(); i++) {
                if (this.coefficients()[i] != o.coefficients()[i]) {
                    isEquals = false;
                    break;
                }
            }
        }
        return isEquals;
    }

    @Override
    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        if (coefficients().length == 1 && coefficient(0) == 0) {
            return "0";
        }
        for (int i = this.degree(); i >= 0; i--) {
            if (coefficient(i) != 0) {
                if (coefficient(i) > 0 && i != this.degree()) {
                    polynominalStr.append("+");
                }

                if (i == 0) {
                    polynominalStr.append(coefficient(i));
                } else if (i == 1) {
                    if (coefficient(i) == 1) {
                        polynominalStr.append("x");
                    } else {
                        polynominalStr.append(coefficient(i)).append("x");
                    }
                } else {
                    if (coefficient(i) == 1) {
                        polynominalStr.append("x^").append(i);
                    } else {
                        polynominalStr.append(coefficient(i)).append("x^").append(i);
                    }
                }
            }
        }
        return polynominalStr.toString();
    }

    public double evaluate(double x) {
        double result = coefficients()[coefficients().length - 1];
        for (int i = coefficients().length - 2; i >= 0; i--) {
            result *= x;
            result += coefficients()[i];
        }
        return result;
    }
}
