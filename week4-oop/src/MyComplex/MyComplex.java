package MyComplex;

import java.util.Scanner;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + this.real +
                " + " + this.imag + "i)";
    }

    public boolean isReal() {
        return (this.imag == 0);
    }

    public boolean isImaginary() {
        return (this.real == 0);
    }

    public boolean equals(double real, double imag) {
        return ((this.real ==  real) && (this.imag == imag));
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.getReal() && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real + right.getReal());
        newComplex.setImag(this.imag + right.getImag());
        return newComplex;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real - right.getReal());
        newComplex.setImag(this.imag - right.getImag());
        return newComplex;
    }

    public MyComplex multiply(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(real * right.getReal() - imag * right.getImag());
        newComplex.setImag(real * right.getImag() + imag * right.getReal());
        return newComplex;
    }

    public MyComplex divide(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.setReal((real * right.getReal() + imag * right.getImag())
                / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2)));
        newComplex.setImag((-1) * real * right.getImag() + imag * right.getReal()
                / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2)));
        return newComplex;
    }

    public MyComplex conjugate() {
        imag = imag * (-1);
        return this;
    }




}
