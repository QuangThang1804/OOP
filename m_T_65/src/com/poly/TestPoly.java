package com.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestPoly {
    public static void main(String[] args) {
        List<Poly> polyList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                polyList.add(generateArrayPoly());
            } else {
                polyList.add(generateListPoly());
            }
//            polyList.add(new ArrayPoly(arr));
        }
        int[] arr = {5};
        polyList.add(new ArrayPoly(arr));

        double number;
        for (int i = 0; i < polyList.size(); i++) {
            System.out.printf("Poly %d:\n", i + 1);
            System.out.println(polyList.get(i).toString());
            System.out.println(polyList.get(i).derivative());
            number = (double) (Math.random() * 10);
            System.out.println(number);
            System.out.println(polyList.get(i).evaluate(number));
            if (polyList.get(i) instanceof ArrayPoly) {
                System.out.println(((ArrayPoly) (polyList.get(i))).type());
            } else {
                System.out.println(((ListPoly) (polyList.get(i))).type());
            }
        }

//        System.out.println(((ArrayPoly) (polyList).get(0)).plus(((ArrayPoly) (polyList).get(1))));
//        System.out.println(((ArrayPoly) (polyList).get(2)).minus(((ArrayPoly) (polyList).get(3))));
//        System.out.println(((ArrayPoly) (polyList).get(1)).times(((ArrayPoly) (polyList).get(3))));

//        System.out.println(((ListPoly) (polyList).get(5)).plus(((ListPoly) (polyList).get(6))));
//        System.out.println(((ListPoly) (polyList).get(7)).minus(((ListPoly) (polyList).get(8))));
//        System.out.println(((ListPoly) (polyList).get(6)).times(((ListPoly) (polyList).get(8))));
    }

    public static Poly generateArrayPoly() {
        int degree;
        int[] coefficients;
        degree = (int) (Math.random() * 5) + 1;
        coefficients = new int[degree + 1];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = (int) (Math.random() * 10);
        }
        return new ArrayPoly(coefficients);
    }

    public static Poly generateListPoly() {
        int degree;
        int[] coefficients;
        degree = (int) (Math.random() * 5) + 1;
        coefficients = new int[degree + 1];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = (int) (Math.random() * 10);
        }
        return new ListPoly(coefficients);
    }
}
