package MyComplex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter complex number 1 (real and imaginary part): ");
//        MyComplex myComplex1 = new MyComplex(input.nextDouble(), input.nextDouble());
//        System.out.print("Enter complex number 2 (real and imaginary part): ");
//        MyComplex myComplex2 = new MyComplex(input.nextDouble(), input.nextDouble());
        MyComplex myComplex1 = enterComplex(input, 1);
        MyComplex myComplex2 = enterComplex(input, 2);

        System.out.println("Number 1 is: " + myComplex1.toString());
        printCheckReal(myComplex1);
        printCheckImag(myComplex1);

        System.out.println("Number 2 is: " + myComplex2.toString());
        printCheckReal(myComplex2);
        printCheckImag(myComplex2);

        printCheckEquals(myComplex1, myComplex2);
        printAdd(myComplex1, myComplex2);
    }

    public static MyComplex enterComplex(Scanner input, int index) {
        System.out.print("Enter the number " + index + " (real and imaginary part): ");
        return new MyComplex(input.nextDouble(), input.nextDouble());
    }

    public static void printCheckReal(MyComplex myComplex) {
        if (myComplex.isReal()) {
            System.out.println(myComplex + " is a pure real number");
        } else {
            System.out.println(myComplex + " is NOT pure real number");
        }
    }

    public static void printCheckImag(MyComplex myComplex) {
        if (myComplex.isImaginary()) {
            System.out.println(myComplex + " is a pure imaginary number");
        } else {
            System.out.println(myComplex + " is NOT pure imaginary number");
        }
    }

    public static void printCheckEquals(MyComplex myComplex1, MyComplex myComplex2) {
        if (myComplex1.equals(myComplex2)) {
            System.out.println(myComplex1 + " is equal to " + myComplex2);
        } else {
            System.out.println(myComplex1 + " is not equal to " + myComplex2);
        }
    }

    public static void printAdd(MyComplex myComplex1, MyComplex myComplex2) {
        MyComplex addComplex = myComplex1.addNew(myComplex2);
        System.out.println(myComplex1 + " + " + myComplex2 + " = " + addComplex);
    }
}
