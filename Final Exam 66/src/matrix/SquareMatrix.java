package matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    public SquareMatrix(int[][] matrix) {
        this.data = matrix;
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    private void initRandom(int size) {
        data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.data[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     *
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        int[] cipalDiagonal = new int[data.length];
        for (int i = 0; i < cipalDiagonal.length; i++) {
            for (int j = 0; j < cipalDiagonal.length; j++) {
                if (i == j) {
                    cipalDiagonal[i] = data[i][j];
                }
            }
        }
        return cipalDiagonal;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     *
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        int[] secondaryDiagonal = new int[data.length];
        for (int i = 0; i < secondaryDiagonal.length; i++) {
            for (int j = 0; j < secondaryDiagonal.length; j++) {
                if (j == secondaryDiagonal.length - 1 - i) {
                    secondaryDiagonal[i] = data[i][j];
                }
            }
        }
        return secondaryDiagonal;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     *
     * @return các số nguyên tố trong ma trận.
     */

    public boolean isPrimeNumber(int number) {
        boolean isPrimeNumber = true;
        if (number == 1 || number == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }

    public int[] primes() {
        List<Integer> primesNumber = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (isPrimeNumber(data[i][j])) {
                    primesNumber.add(data[i][j]);
                }
            }
        }
        int[] primesArr = new int[primesNumber.size()];
        for (int i = 0; i < primesArr.length; i++) {
            primesArr[i] = primesNumber.get(i);
        }
        return primesArr;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     *
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        int[][] sortedMatrix = new int[data.length][data.length];
        int[] oneDArr = new int[data.length * data.length];
        List<Integer> listOfNum = new ArrayList<>();
        int idxOfArr = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                listOfNum.add(data[i][j]);
            }
        }
        Collections.sort(listOfNum);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                sortedMatrix[i][j] = listOfNum.get(i * (data.length - 1) + j);
            }
        }
//        data = sortedMatrix;
        return new SquareMatrix(sortedMatrix);
        /* TODO */
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     *
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     *
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        int[][] addMatrix = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                addMatrix[i][j] = this.data[i][j] + that.get(i, j);
            }
        }
//        data = addMatrix;
        return new SquareMatrix(addMatrix);
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        int[][] minusMatrix = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                minusMatrix[i][j] = this.data[i][j] - that.get(i, j);
            }
        }
//        data = minusMatrix;
        return new SquareMatrix(minusMatrix);
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        int[][] multiplyMatrix = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                multiplyMatrix[i][j] = 0;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < data.length; k++) {
                    multiplyMatrix[i][j] += data[i][k] * that.get(k, j);
                }
            }
        }
//        data = multiplyMatrix;
        return new SquareMatrix(multiplyMatrix);
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     *
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        int[][] scaledMatrix = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                scaledMatrix[i][j] = this.data[i][j] * value;
            }
        }
//        data = scaledMatrix;
        return new SquareMatrix(scaledMatrix);
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     *
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        int[][] transposeMatrix = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                transposeMatrix[i][j] = this.data[j][i];
            }
        }
//        data = transposeMatrix;
        return new SquareMatrix(transposeMatrix);
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     * 1 2 3
     * 4 5 6
     * 7 8 9
     *
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (j != data.length - 1) {
                    sb.append(data[i][j]).append(" ");
                } else {
                    sb.append(data[i][j]).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
