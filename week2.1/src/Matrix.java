// 4.2
import java.util.Scanner;

public class Matrix {
    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        boolean haveSameDimenstion = false;
        if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length)) {
            haveSameDimenstion = true;
        }
        return haveSameDimenstion;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        boolean haveSameDimenstion = false;
        if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length)) {
            haveSameDimenstion = true;
        }
        return haveSameDimenstion;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] addMatrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                addMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return addMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] addMatrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                addMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return addMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] subMatrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < subMatrix.length; row++) {
            for (int col = 0; col < subMatrix[0].length; col++) {
                subMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return subMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] subMatrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < subMatrix.length; row++) {
            for (int col = 0; col < subMatrix[0].length; col++) {
                subMatrix[row][col] = matrix1[row][col] - matrix2[col][row];
            }
        }
        return subMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mulMatrix = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col2 = 0; col2 < matrix2[0].length; col2++) {
                for (int col1 = 0; col1 < matrix1[0].length; col1++)
                    mulMatrix[row][col2] += matrix1[row][col1] * matrix2[col1][col2];
            }
        }
        return mulMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] mulMatrix = new double[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col2 = 0; col2 < matrix2[0].length; col2++) {
                    for (int col1 = 0; col1 < matrix1[0].length; col1++)
                        mulMatrix[row][col2] += matrix1[row][col1] * matrix2[col1][col2];
                }
            }
        }
        return mulMatrix;
    }

    public static int[][] enterMatrix(Scanner input) {
        System.out.print("Enter the dimension of matrix: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.print("Enter the value of matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void testMatrix() {
        int[][] matrix1 = generateMatrix(3, 4);
        int[][] matrix2 = generateMatrix(3, 4);
        int[][] matrix3 = generateMatrix(4, 2);
        System.out.println("Array 1:");
        print(matrix1);
        System.out.println("Array 2:");
        print(matrix2);
        System.out.println("Array 3:");
        print(matrix3);

        if (haveSameDimension(matrix1, matrix2)) {
            int[][] addMatrix = add(matrix1, matrix2);
            System.out.println("The add matrix of matrix1 and matrix2 is: ");
            print(addMatrix);

            int[][] subMatrix = subtract(matrix1, matrix2);
            System.out.println("The substract matrix of matrix1 and matrix2 is: ");
            print(subMatrix);
        }

        int[][] multiplyMatrix = multiply(matrix1, matrix3);
        System.out.println("The multiply matrix of matrix1 and matrix3 is: ");
        print(multiplyMatrix);
    }

    public static void main(String[] args) {
        testMatrix();
    }
}
