package poly;

public class ArrayPolynominal extends AbstractPolynominal {
    static final int DEFAULT_CAPACITY = 16;
    double[] coefficients;
    int size;

    public ArrayPolynominal() {
        this.coefficients = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private void enlarge() {
        double[] newArr = new double[this.coefficients.length + DEFAULT_CAPACITY];
        System.arraycopy(coefficients, 0, newArr, 0, coefficients.length);
        coefficients = newArr;
    }

    public ArrayPolynominal append(double x) {
        if (size >= this.coefficients.length - 1) {
            enlarge();
        }
        this.coefficients[size++] = x;
        return this;
    }

    @Override
    public double coefficient(int index) {
        return this.coefficients[index];
    }

    @Override
    public double[] coefficients() {
        return this.coefficients;
    }

    @Override
    public int degree() {
        int degree = 0;
        for (int i = coefficients().length - 1; i >= 0; i--) {
            if (coefficient(i) != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    @Override
    public Polynominal derivative() {
        ArrayPolynominal newArrPoly = new ArrayPolynominal();
        newArrPoly.coefficients = differentiate();
        return newArrPoly;
    }

    @Override
    public double evaluate(double x) {
        double result = coefficient(degree());
        for (int i = degree() - 1; i >= 0; i--) {
            result *= x;
            result += coefficient(i);
        }
        return result;
    }

    private boolean checkIndex(int index) {
        if (index < 0 || index > size) {
            return false;
        } else {
            return true;
        }
    }
    
    public ArrayPolynominal insert(double x, int index) {
        if (checkIndex(index)) {
            if (size >= this.coefficients.length - 1) {
                enlarge();
            }
            for (int i = size; i > index; i--) {
                this.coefficients[i] = this.coefficients[i - 1];
            }
            this.coefficients[index] = x;
        } else {
            System.out.println("Index out of range");
        }
        return this;
    }

    public ArrayPolynominal set(double x, int index) {
        if (checkIndex(index)) {
            this.coefficients[index] = x;
        } else {
            System.out.println("Index out of range");
        }
        return this;
    }

    public ArrayPolynominal plus(ArrayPolynominal another) {
        int maxLength = Math.max(this.coefficients.length, another.coefficients.length);
        int minLength = Math.min(this.coefficients.length, another.coefficients.length);
        double[] newCoeff = new double[maxLength];
        for (int i = 0; i < minLength; i++) {
            newCoeff[i] = this.coefficients[i] + another.coefficient(i);
        }

        if (maxLength == this.coefficients.length) {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = this.coefficient(i);
            }
        } else {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = another.coefficient(i);
            }
        }
        this.coefficients = newCoeff;
        return this;
    }

    public ArrayPolynominal minus(ArrayPolynominal another) {
        int maxLength = Math.max(this.coefficients.length, another.coefficients.length);
        int minLength = Math.min(this.coefficients.length, another.coefficients.length);
        double[] newCoeff = new double[maxLength];
        for (int i = 0; i < minLength; i++) {
            newCoeff[i] = this.coefficients[i] - another.coefficient(i);
        }

        if (maxLength == this.coefficients.length) {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = this.coefficient(i);
            }
        } else {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = -another.coefficient(i);
            }
        }
        this.coefficients = newCoeff;
        return this;
    }

    public ArrayPolynominal multiply(ArrayPolynominal another) {
        int newLengthCoeffs = this.coefficients.length + another.coefficients.length - 1;
        double[] newCoeffs = new double[newLengthCoeffs];
        int index = 0;
        while (index < newCoeffs.length) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficients.length - 1 && fid <= another.coefficients.length - 1) {
                    newCoeffs[index] += coefficients[lid] * another.coefficients[fid];
                }
            }
            index++;
        }
        this.coefficients = newCoeffs;
        return this;
    }
}
