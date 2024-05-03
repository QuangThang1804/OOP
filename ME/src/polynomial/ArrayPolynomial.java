package polynomial;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
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
    public double coefficientAt(int index) {
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
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtStart(double coefficient) {
        /* TODO */
        insertAtPosition(0, coefficient);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtEnd(double coefficient) {
        /* TODO */
        insertAtPosition(size, coefficient);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void insertAtPosition(int index, double coefficient) {
        if (size >= coefficents.length - 1) {
            allocateMore();
        }
        for (int i = size; i > index; i--) {
            this.coefficents[i] = this.coefficents[i - 1];
        }
        this.coefficents[index] = coefficient;
        size++;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void set(int index, double coefficient) {
        this.coefficents[index] = coefficient;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        int degree = 0;
        for (int i = coefficients().length - 1; i >= 0; i--) {
            if (coefficientAt(i) != 0) {
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
        double result = coefficientAt(degree());
        for (int i = degree() - 1; i >= 0; i--) {
            result *= x;
            result += coefficientAt(i);
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
            newCoeff[i] = this.coefficents[i] + another.coefficientAt(i);
        }

        if (maxLength == this.coefficents.length) {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = this.coefficientAt(i);
            }
        } else {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = another.coefficientAt(i);
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
            newCoeff[i] = this.coefficientAt(i) - another.coefficientAt(i);
        }

        if (maxLength == this.coefficents.length) {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = this.coefficientAt(i);
            }
        } else {
            for (int i = minLength; i < newCoeff.length; i++) {
                newCoeff[i] = -another.coefficientAt(i);
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
                    newCoeffs[index] += coefficientAt(lid) * another.coefficientAt(fid);
                }
            }
            index++;
        }
        this.coefficents = newCoeffs;
        return this;
    }

    /**
     * Thêm kích thước mảng gấp đôi để lưu đa thức.
     */
    private void allocateMore() {
        double[] newArr = new double[this.coefficents.length * 2];
        System.arraycopy(coefficents, 0, newArr, 0, coefficents.length);
        coefficents = newArr;
    }
}
