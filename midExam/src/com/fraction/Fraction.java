package com.fraction;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Fraction extends Number implements Comparable<Fraction> {

    private int numerator;
    private int denominator;

    /**
     * Creates a new instance of Fraction
     */

    public Fraction(Fraction another) {
        /* TODO */
    }

    public Fraction(int numerator, int denominator) {
        /* TODO */
    }

    public Fraction(int numerator) {
        /* TODO */
    }

    public int getNumerator() {
        /* TODO */
    }

    public void setNumerator(int numerator) {
        /* TODO */
    }

    public int getDenominator() {
        /* TODO */
    }

    public void setDenominator(int denominator) {
        /* TODO */
    }

    public String toString() {
        /* TODO */
    }

    public boolean equals(Fraction other) {
        /* TODO */
    }

    public double doubleValue() {
        /* TODO */
    }

    public float floatValue() {
        /* TODO */
    }

    public int intValue() {
        /* TODO */
    }

    public long longValue() {
        /* TODO */
    }

    public int compareTo(Fraction other) {
        /* TODO */
    }

    private static int gcd(int m, int n) {
        /* TODO */
    }

    private void simplify() {
        /* TODO */
    }

    public Fraction add(Fraction other) {
        /* TODO */
    }

    public Fraction add(int other) {
        /* TODO */
    }

    /*
     *   Our main method tests our class and demonstrates behavior
     * */
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(1, 4);

        System.out.println(f1.add(1));
        System.out.println(f1.intValue());
        System.out.println(f1.doubleValue());

        List<Fraction> myFractions = new ArrayList<>();
        myFractions.add(f1);
        myFractions.add(f2);
        myFractions.add(f3);
        Collections.sort(myFractions);

        for (Fraction f : myFractions) {
            System.out.println(f);
        }
    }
}