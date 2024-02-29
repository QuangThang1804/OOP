import java.util.Scanner;

public class Matrix {
    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println();
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println();
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
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                subMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return subMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] subMatrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                subMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return subMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mulMatrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                mulMatrix[row][col] += matrix1[row][col] * matrix2[row][col];
            }
        }
        return mulMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] mulMatrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                mulMatrix[row][col] += matrix1[row][col] * matrix2[row][col];
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


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of matrix 1: ");
        int[][] matrix1 = enterMatrix(input);
        int[][] matrix2 = enterMatrix(input);

        int[][] mulMatrixs = multiply(matrix1, matrix2);
        print(mulMatrixs);

    }
}
