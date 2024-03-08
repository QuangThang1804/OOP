package MyPolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length;
    }

    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] >= 0 && i != coeffs.length - 1) {
                polynominalStr.append("+");
            }

            if (i == 0) {
                polynominalStr.append(coeffs[i]);
            } else if (i == 1) {
                polynominalStr.append(coeffs[i]).append("x");
            } else {
                polynominalStr.append(coeffs[i]).append("x^").append(i);
            }
        }
        return polynominalStr.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int newLengthCoeffs = (Math.max(this.getDegree(), right.getDegree()));
        double[] newCoeffs = new double[newLengthCoeffs];
        MyPolynomial newPolynomial = new MyPolynomial(newCoeffs);
        for (int i = coeffs.length - 1; i >= 0; i--) {
            newPolynomial.coeffs[i] = coeffs[i] + right.coeffs[i];
        }
        return newPolynomial;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newLengthCoeffs = this.getDegree() + right.getDegree() - 1;
        double[] newCoeffs = new double[newLengthCoeffs];
        MyPolynomial newPolynomial = new MyPolynomial(newCoeffs);
        int index = 0;
        while (index < this.getDegree() + right.getDegree()) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coeffs.length - 1 && fid <= right.coeffs.length - 1) {
                    newPolynomial.coeffs[index] += coeffs[lid] * right.coeffs[fid];
                }
            }
            index++;
        }
        return newPolynomial;
    }
}
