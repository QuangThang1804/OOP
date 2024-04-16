package com.fraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestFraction {
    public static void main(String[] args) {
        List<Fraction> fractions = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            fractions.add(new Fraction((int) (Math.random() * 100) + 1,
                    (int) (Math.random() * 100) + 1));
        }

        // sort fractions by value
        List<Fraction> listSortByValue = new ArrayList<>(fractions);
        int n = listSortByValue.size();
        boolean swapped;
        Fraction temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (listSortByValue.get(i - 1).compareTo(listSortByValue.get(i)) > 0) {
                    temp = listSortByValue.get(i - 1);
                    listSortByValue.set(i - 1, listSortByValue.get(i));
                    listSortByValue.set(i, temp);
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        System.out.println(listSortByValue.toString());

        // sort fractions by value of denominator
        n = fractions.size();
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (fractions.get(i - 1).getDenominator()
                        > fractions.get(i).getDenominator()) {
                    temp = fractions.get(i - 1);
                    fractions.set(i - 1, fractions.get(i));
                    fractions.set(i, temp);
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        System.out.println(fractions.toString());

        // Print the second-largest number
        System.out.println(listSortByValue.get(listSortByValue.size() - 2));
    }
}
