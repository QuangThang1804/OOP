package hus.Week12.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        if (coefficients().length == 1 && coefficient(0) == 0) {
            return "0";
        }
        for (int i = this.degree(); i >= 0; i--) {
            if (coefficient(i) != 0) {
                if (coefficient(i) > 0 && i != this.degree()) {
                    polynominalStr.append("+");
                }

                if (i == 0) {
                    polynominalStr.append(coefficient(i));
                } else if (i == 1) {
                    if (coefficient(i) == 1) {
                        polynominalStr.append("x");
                    } else {
                        polynominalStr.append(coefficient(i)).append("x");
                    }
                } else {
                    if (coefficient(i) == 1) {
                        polynominalStr.append("x^").append(i);
                    } else {
                        polynominalStr.append(coefficient(i)).append("x^").append(i);
                    }
                }
            }
        }
        return polynominalStr.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] arr = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            arr[i] = coefficient(i + 1) * (i + 1);
        }
        return arr;
    }
}
