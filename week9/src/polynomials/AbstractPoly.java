package polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        return null;
    }
}
