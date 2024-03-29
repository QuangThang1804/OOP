package com.poly;

public abstract class AbstractPoly implements Poly{
    protected int degree;

    public AbstractPoly() {
    }

    @Override
    public int degree() {
        return 0;
    }

    int[] differentiate() {
        int[] arr = new int[this.degree - 1];
        for (int i = arr.length; i >= 1; i--) {
            arr[i - 1] = this.coefficients()[i] * i;
        }
        return arr;
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
        StringBuilder polyStr = new StringBuilder();
        for (int i = 0; i <= this.degree; i++) {
            if (this.coefficients()[i] != 0) {
                if (i == this.degree()) {
                    polyStr.append(this.coefficients()[i]).append("x^").append(i);
                } else {
                    String dau = "";
                    dau = (this.coefficients()[i] > 0) ? " + " : " - ";
                    polyStr.append(dau);
                    if (i == 0) {
                        polyStr.append(this.coefficients()[i]);
                    } else if (i == 1) {
                        polyStr.append(this.coefficients()[i]).append("x");
                    } else {
                        polyStr.append(this.coefficients()[i]).append("x^").append(i);
                    }
                }
            }
        }
        return polyStr.toString();
    }

    public double evaluate(double x) {
        return 0;
    }
}
