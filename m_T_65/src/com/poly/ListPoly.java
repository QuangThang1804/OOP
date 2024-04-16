package com.poly;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly{
    private List<Integer> coefficients;

    public ListPoly(int[] coefficients) {
        super();
        List<Integer> newList = new ArrayList<>();
        for (int num: coefficients) {
            newList.add(num);
        }
        this.coefficients = newList;
    }

    private void reduce() {
        for (int i = this.coefficients.size() - 1; i >= 0; i--) {
            if (this.coefficients.get(i) != 0) {
                this.degree = i;
                break;
            }
        }
    }

    @Override
    public int coefficient(int i) {
        return coefficients.get(i);
    }

    @Override
    public int[] coefficients() {
        int[] newArr = new int[this.coefficients.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = this.coefficients.get(i);
        }
        return newArr;
    }

    @Override
    public Poly derivative() {
        reduce();
        return new ListPoly(differentiate());
    }

    public String type() {
        return "List Poly";
    }

    public ListPoly plus(ListPoly another) {
        int maxLength = Math.max(this.coefficients().length, another.coefficients().length);
        int minLength = Math.min(this.coefficients().length, another.coefficients().length);

        int[] newCoeffs = new int[maxLength];

        for (int i = 0; i < minLength; i++) {
            newCoeffs[i] = coefficient(i) + another.coefficient(i);
        }

        if (maxLength == coefficients().length) {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = coefficient(i);
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = another.coefficient(i);
            }
        }
        List<Integer> newList = new ArrayList<>();
        for (int num: newCoeffs) {
            newList.add(num);
        }
        this.coefficients = newList;
        return this;
    }

    public ListPoly minus(ListPoly another) {
        int maxLength = Math.max(this.coefficients().length, another.coefficients().length);
        int minLength = Math.min(this.coefficients().length, another.coefficients().length);

        int[] newCoeffs = new int[maxLength];

        for (int i = 0; i < minLength; i++) {
            newCoeffs[i] = coefficient(i) - another.coefficient(i);
        }

        if (maxLength == coefficients().length) {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = coefficient(i);
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                newCoeffs[i] = -another.coefficient(i);
            }
        }
        List<Integer> newList = new ArrayList<>();
        for (int num: newCoeffs) {
            newList.add(num);
        }
        this.coefficients = newList;
        return this;
    }

    public ListPoly times(ListPoly another) {
        int newLengthCoeffs = this.coefficients().length + another.coefficients().length - 1;
        int[] newCoeffs = new int[newLengthCoeffs];
        int index = 0;
        while (index < newLengthCoeffs) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficients().length - 1 && fid <= another.coefficients().length - 1) {
                    newCoeffs[index] += coefficients.get(lid) * another.coefficients.get(fid);
                }
            }
            index++;
        }
        List<Integer> newList = new ArrayList<>();
        for (int num: newCoeffs) {
            newList.add(num);
        }
        this.coefficients = newList;
        return this;
    }
}
