package hus.Week12.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        return this.coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] arr = new double[this.coefficients.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = this.coefficients.get(i);
        }
        return arr;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        int degree = 0;
        for (int i = this.coefficients.size() - 1; i >= 0; i--) {
            if (coefficient(i) != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result = this.coefficients.get(degree());
        for (int i = degree() - 1; i >= 0; i--) {
            result *= x;
            result += this.coefficients.get(i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial newListPoly = new ListPolynomial();
        List<Double> listDerivative = new ArrayList<>();
        for (double num: differentiate()) {
            listDerivative.add(num);
        }
        newListPoly.coefficients = listDerivative;
        return newListPoly;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int maxLength = Math.max(this.coefficients.size(), another.coefficients.size());
        int minLength = Math.min(this.coefficients.size(), another.coefficients.size());
        List<Double> listPlus = new ArrayList<>();
        for (int i = 0; i < minLength; i++) {
            listPlus.add(this.coefficients.get(i) + another.coefficients.get(i));
        }

        if (maxLength == this.coefficients.size()) {
            for (int i = minLength; i < maxLength; i++) {
                listPlus.add(i,this.coefficient(i));
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                listPlus.set(i, another.coefficient(i));
            }
        }
        this.coefficients = listPlus;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int maxLength = Math.max(this.coefficients.size(), another.coefficients.size());
        int minLength = Math.min(this.coefficients.size(), another.coefficients.size());
        List<Double> listMinus = new ArrayList<>();
        for (int i = 0; i < minLength; i++) {
            listMinus.add(i, this.coefficients.get(i) - another.coefficients.get(i));
        }

        if (maxLength == this.coefficients.size()) {
            for (int i = minLength; i < maxLength; i++) {
                listMinus.add(i, this.coefficient(i));
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                listMinus.add(i, -another.coefficient(i));
            }
        }
        this.coefficients = listMinus;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int newLengthCoeffs = this.coefficients.size() + another.coefficients.size() - 1;
        double[] newCoeffs = new double[newLengthCoeffs];
        List<Double> listMutiply = new ArrayList<>();
        int index = 0;
        while (index < newLengthCoeffs) {
            for (int fid = 0, lid = index; (fid <= index && lid >= 0); fid++, lid--) {
                if (lid <= coefficients.size() - 1 && fid <= another.coefficients.size() - 1) {
                    newCoeffs[index] += coefficients.get(lid) * another.coefficients.get(fid);
                }
            }
            index++;
        }

        for (double num: newCoeffs) {
            listMutiply.add(num);
        }
        this.coefficients = listMutiply;
        return this;
    }
}
