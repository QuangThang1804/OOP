package com.poly;

public interface Poly {
    public int coefficient(int i);
    public int[] coefficients();
    public int degree();
    public Poly derivative();
    public double evaluate(double x);
}
