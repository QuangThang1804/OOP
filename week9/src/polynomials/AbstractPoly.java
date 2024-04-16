package polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        double[] arr = new double[degree()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = coefficients()[i + 1] * (i + 1);
        }
        return arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        AbstractPoly thatPoly = (AbstractPoly) o;
        double[] thatCoeff = thatPoly.coefficients();
        double[] thisCoeff = coefficients();
        if (thisCoeff.length != thatCoeff.length) {
            return false;
        }
        for (int i = 0; i < thatCoeff.length; i++) {
            if (thisCoeff[i] != thatCoeff[i])
                return false;
        }
        return true;
    }
//
//    public boolean equals(Object o) {
//        return this.coefficients().equals(o);
//    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        for (int i = this.degree(); i >= 0; i--) {
            if (coefficient(i) != 0) {
                if (coefficient(i) > 0 && i != this.degree()) {
                    polynominalStr.append("+");
                }

                if (i == 0) {
                    polynominalStr.append(coefficient(i));
                } else if (i == 1) {
                    polynominalStr.append(coefficient(i)).append("x");
                } else {
                    polynominalStr.append(coefficient(i)).append("x^").append(i);
                }
            }
        }
        return polynominalStr.toString();
    }
}
