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
        return new int[0];
    }

    @Override
    public Poly derivative() {
        int[] arr = new int[this.degree - 1];
        for (int i = arr.length; i >= 1; i--) {
            arr[i - 1] = this.coefficients()[i] * i;
        }
        this.coefficients = arr;
        return this;
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
