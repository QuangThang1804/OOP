package polynomial;

public class TestPolynomial {
    public static void main(String[] args) {
        testArrayPolynomial();
        testListPolynomial();
        testRootSolver();
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyPolynomial>.txt
           (ví dụ, NguyenVanA_123456_MyPolynomial.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
    }

    public static void testArrayPolynomial() {
        System.out.println("Test Array Polynominal");
        ArrayPolynomial ap1 = new ArrayPolynomial();
        ap1.insertAtEnd(0);
        ap1.insertAtEnd(2);
        ap1.insertAtEnd(-3);
        ap1.insertAtEnd(1);
        ap1.insertAtEnd(0);
        System.out.println(ap1.toString());
        System.out.println("Gia tri cua poly tai x = 5: " + ap1.evaluate(5));

        ArrayPolynomial ap2 = new ArrayPolynomial();
        ap2.insertAtEnd(0);
        ap2.insertAtEnd(0);
        ap2.insertAtEnd(6);
        ap2.insertAtEnd(-5);
        ap2.insertAtEnd(1);
        ap2.set(2, 10);
        System.out.println(ap2);

        System.out.println("Plus");
        System.out.println(ap1.plus(ap2));
        System.out.println("Minus");
        System.out.println(ap1.minus(ap2));
        System.out.println("Multiply");
        System.out.println(ap1.multiply(ap2));
        System.out.println();
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
    }

    public static void testListPolynomial() {
        System.out.println("Test List Polynominal");
        ListPolynomial lp1 = new ListPolynomial();
        lp1.insertAtEnd(0);
        lp1.insertAtEnd(2);
        lp1.insertAtEnd(-3);
        lp1.insertAtEnd(1);
        lp1.insertAtEnd(0);
        System.out.println(lp1);

        ListPolynomial lp2 = new ListPolynomial();
        lp2.insertAtEnd(0);
        lp2.insertAtEnd(0);
        lp2.insertAtEnd(6);
        lp2.insertAtEnd(-5);
        lp2.insertAtEnd(1);
        System.out.println(lp2);
        System.out.println("Plus");
        System.out.println(lp1.plus(lp2));
        System.out.println("Minus");
        System.out.println(lp1.minus(lp2));
        System.out.println("Multiply");
        System.out.println(lp1.multiply(lp2));
        System.out.println();
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
    }

    public static void testRootSolver() {
        System.out.println("Test Root Solver");
        /*
         TODO

         - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
         - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
         */
        ArrayPolynomial ap1 = new ArrayPolynomial();
        ap1.insertAtEnd(0);
        ap1.insertAtEnd(2);
        ap1.insertAtEnd(-3);
        ap1.insertAtEnd(1);
        ap1.insertAtEnd(0);
        System.out.println(ap1);

        PolynomialRootFinding polyRoot = new PolynomialRootFinding(ap1);
        polyRoot.setRootSolver(new NewtonRaphsonSolver(100, 100));
        // test with Newton
        System.out.println("nghiem theo pp Newton");
        System.out.println(polyRoot.solve(1, 5));

        polyRoot.setRootSolver(new SecantSolver(100, 100));
        // test with Secant
        System.out.println("nghiem theo pp Secant");
        System.out.println(polyRoot.solve(-1, 2));

        polyRoot.setRootSolver(new BisectionSolver(100, 100));

        // Nhap a, b sao cho f(a) < 0 va f(b) > 0
        System.out.println("nghiem theo pp Bisection");
        System.out.println(polyRoot.solve(-1, 5));
    }
}
