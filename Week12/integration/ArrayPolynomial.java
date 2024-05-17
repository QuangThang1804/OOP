package hus.Week12.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        return this.coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return this.coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        insert(coefficient, size);
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (size >= coefficents.length - 1) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            this.coefficents[i] = this.coefficents[i - 1];
        }
        this.coefficents[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        this.coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        int degree = -1;
        for (int i = coefficients().length - 1; i >= 0; i--) {
            if (coefficient(i) != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = coefficient(degree());
        for (int i = degree() - 1; i >= 0; i--) {
            result *= x;
            result += coefficient(i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        ArrayPolynomial newArrPoly = new ArrayPolynomial();
        newArrPoly.coefficents = differentiate();
        return newArrPoly;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int maxLength = Math.max(this.coefficents.length, another.coefficents.length);
        int minLength = Math.min(this.coefficents.length, another.coefficents.length);
        double[] newCoeff = new double[maxLength];
        for (int i = 0; i < minLength; i++) {
            newCoeff[i] = this.coefficents[i] + another.coefficient(i);
        }

        if (maxLength == this.coefficents.length) {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = this.coefficient(i);
            }
        } else {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = another.coefficient(i);
            }
        }
        this.coefficents = newCoeff;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int maxLength = Math.max(this.coefficents.length, another.coefficents.length);
        int minLength = Math.min(this.coefficents.length, another.coefficents.length);
        double[] newCoeff = new double[maxLength];
        for (int i = 0; i < minLength; i++) {
            newCoeff[i] = this.coefficient(i) - another.coefficient(i);
        }

        if (maxLength == this.coefficents.length) {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = this.coefficient(i);
            }
        } else {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = -another.coefficient(i);
            }
        }
        this.coefficents = newCoeff;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int newLengthCoeffs = this.coefficents.length + another.coefficents.length - 1;
        double[] newCoeffs = new double[newLengthCoeffs];
        int index = 0;
        while (index < newCoeffs.length) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficents.length - 1 && fid <= another.coefficents.length - 1) {
                    newCoeffs[index] += coefficient(lid) * another.coefficient(fid);
                }
            }
            index++;
        }
        this.coefficents = newCoeffs;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] newArr = new double[this.coefficents.length * 2];
        System.arraycopy(coefficents, 0, newArr, 0, coefficents.length);
        coefficents = newArr;
    }
}
