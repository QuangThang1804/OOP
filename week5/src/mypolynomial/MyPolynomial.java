package mypolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        int degree = -1;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    public String toString() {
        StringBuilder polynominalStr = new StringBuilder();
        for (int i = this.getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (coeffs[i] > 0 && i != this.getDegree()) {
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
        }
        return polynominalStr.toString();
    }

    public double evaluate(double x) {
        double result = coeffs[coeffs.length - 1];
        for (int i = coeffs.length - 2; i >= 0; i--) {
            result *= x;
            result += coeffs[i];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int newLengthCoeffs = (Math.max(this.getDegree(), right.getDegree()) + 1);
        int minLength = Math.min(this.getDegree(), right.getDegree()) + 1;
        double[] newCoeffs = new double[newLengthCoeffs];

        for (int i = 0; i < minLength; i++) {
            newCoeffs[i] = coeffs[i] + right.coeffs[i];
        }

        if (newLengthCoeffs == coeffs.length) {
            for (int i = minLength; i < newLengthCoeffs; i++) {
                newCoeffs[i] = coeffs[i];
            }
        } else {
            for (int i = minLength; i < newLengthCoeffs; i++) {
                newCoeffs[i] = right.coeffs[i];
            }
        }
        this.coeffs = newCoeffs;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newLengthCoeffs = coeffs.length + right.coeffs.length - 1;
        double[] newCoeffs = new double[newLengthCoeffs];
        MyPolynomial newPolynomial = new MyPolynomial(newCoeffs);
        int index = 0;
        while (index < newLengthCoeffs) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coeffs.length - 1 && fid <= right.coeffs.length - 1) {
                    newPolynomial.coeffs[index] += coeffs[lid] * right.coeffs[fid];
                }
            }
            index++;
        }
        this.coeffs = newCoeffs;
        return this;
    }

//    public MyPolynomial add(MyPolynomial right) {
//        int newLength = Math.max(this.getDegree(), right.getDegree());
//        double[] newCoeffs = new double[newLength];
//        MyPolynomial newPolynomial = new MyPolynomial(newCoeffs);
//        int indexCurrent = 0;
//
//        for (int i = 0; i < newLength; i++) {
//            if (i < Math.min(this.getDegree(), right.getDegree())) {
//                newPolynomial.coeffs[i] += this.coeffs[i] + right.coeffs[i];
//                indexCurrent = i;
//            }
//        }
//        ++indexCurrent;
//
//        while (indexCurrent < newLength) {
//            if (this.getDegree() == newLength) {
//                newPolynomial.coeffs[indexCurrent] += this.coeffs[indexCurrent];
//            } else if (right.getDegree() == newLength) {
//                newPolynomial.coeffs[indexCurrent] += right.coeffs[indexCurrent];
//            }
//            indexCurrent++;
//        }
//
//        this.coeffs = newPolynomial.coeffs;
//        return this;
//    }
}
