package com.fraction;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Fraction extends Number {

    private int numerator;
    private int denominator;

    /**
     * Creates a new instance of Fraction
     */

    public Fraction(Fraction another) {
        this.numerator = another.getNumerator();
        this.denominator = another.getDenominator();
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Fraction[" +
                + numerator + "/"
                + denominator +
                ']';
    }

    public boolean equals(Fraction other) {
        return (this.numerator * other.getDenominator()
                == this.denominator * other.getDenominator());
    }

    public double doubleValue() {
        return (double) this.numerator / this.denominator;
    }

    public float floatValue() {
        return (float) this.numerator / this.denominator;
    }

    public int intValue() {
        return this.numerator / this.denominator;
    }

    public long longValue() {
        return (long) this.numerator / this.denominator;
    }


    public int compareTo(Fraction other) {
        return 0;
    }

    private static int gcd(int m, int n) {
        int gcd = -1;
        int temp;
        while (n != 0) {
            temp = n;
            n = m % n;
            m = temp;
        }
        return gcd = m;
    }

    private void simplify() {
        int remain = gcd(this.numerator, this.denominator);
        this.numerator /= remain;
        this.denominator /= remain;
    }

    public Fraction add(Fraction other) {
        Fraction addFraction = new Fraction(this);
        addFraction.setNumerator(this.numerator * other.denominator
                + this.denominator * other.numerator);
        addFraction.setDenominator(this.denominator * other.getDenominator());
        return addFraction;
    }

    public Fraction add(int other) {
        Fraction addFraction = new Fraction(this);
        addFraction.setNumerator(this.numerator + other * this.denominator);
        return addFraction;
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
//        Collections.sort(myFractions);

        for (Fraction f : myFractions) {
            System.out.println(f);
        }
    }

//    @Override
//    public int compareTo() {
//        return 0;
//    }
}