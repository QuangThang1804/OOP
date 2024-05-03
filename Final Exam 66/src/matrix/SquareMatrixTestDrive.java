package matrix;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
//        int n = (int) (Math.random() * 5) + 5;
        int n = 3;
        SquareMatrix squareMatrix1 = new SquareMatrix(n);
        SquareMatrix squareMatrix2 = new SquareMatrix(n);
        System.out.println("Matrix 1:");
        System.out.println(squareMatrix1);
        System.out.println("Matrix 2: ");
        System.out.println(squareMatrix2);

        System.out.println("Dg cheo chinh cua matrix 1");
        printArr(squareMatrix1.principalDiagonal());
        System.out.println("Dg cheo chinh cua matrix 2");
        printArr(squareMatrix2.principalDiagonal());

        System.out.println("Dg cheo phu cua matrix 1");
        printArr(squareMatrix1.secondaryDiagonal());
        System.out.println("Dg cheo phu cua matrix 2");
        printArr(squareMatrix2.secondaryDiagonal());

        System.out.println("Add of two matrix");
        System.out.println(squareMatrix1.add(squareMatrix2));
        System.out.println("minus of two matrix");
        System.out.println(squareMatrix1.minus(squareMatrix2));
        System.out.println("multiple of two matrix");
        System.out.println(squareMatrix1.multiply(squareMatrix2));

        System.out.println("Prime numbers of matrix 1");
        printArr(squareMatrix1.primes());
        System.out.println("Prime numbers of matrix 2");
        printArr(squareMatrix2.primes());

        System.out.println("scaled vs 5");
        System.out.println(squareMatrix1.scaled(3));
        System.out.println("sorted matrix 1");
        System.out.println(squareMatrix1.getSortedMatrix());
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
    }

    public static void printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
