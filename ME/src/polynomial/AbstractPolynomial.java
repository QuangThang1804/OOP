package polynomial;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        if (coefficients().length == 1 && coefficientAt(0) == 0) {
            return "0";
        }
        for (int i = this.degree(); i >= 0; i--) {
            if (coefficientAt(i) != 0) {
                if (coefficientAt(i) > 0 && i != this.degree()) {
                    polynominalStr.append("+");
                }

                if (i == 0) {
                    polynominalStr.append(coefficientAt(i));
                } else if (i == 1) {
                    if (coefficientAt(i) == 1) {
                        polynominalStr.append("x");
                    } else {
                        polynominalStr.append(coefficientAt(i)).append("x");
                    }
                } else {
                    if (coefficientAt(i) == 1) {
                        polynominalStr.append("x^").append(i);
                    } else {
                        polynominalStr.append(coefficientAt(i)).append("x^").append(i);
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
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = coefficientAt(i + 1) * (i + 1);
        }
        return arr;

    }
}
