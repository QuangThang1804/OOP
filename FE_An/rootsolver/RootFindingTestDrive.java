package hus.FE_An.rootsolver;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
        TODO

        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootFinding>.txt
        (ví dụ, NguyenVanA_123456_RootFinding.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ, NguyenVanA_123456_RootFinding.txt), và nộp bài
        lên classroom.
        */
        testMyMath();
//        testRootSolver();
    }

    public static  void testMyMath() {
        System.out.println(MyMath.sin(10));
        System.out.println(MyMath.cos(10));
        System.out.println(MyMath.exp(10));
        System.out.println(MyMath.ln(0.5));
    }

    public static void testRootSolver() {
        /*
         TODO

         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */
        AbstractFunction function = new UnivariateRealFunction();
        RootSolver newtonRaphsonSolver = new NewtonRaphsonSolver(0.00001, 1000);
        RootSolver bisectionSolver = new BisectionSolver(0.00001, 1000);
        RootSolver secantSolver = new SecantSolver(0.001, 1000);
        // test newtonRaphson
        UnivariateRealRootFinding univariateRealRootFinding = new UnivariateRealRootFinding(function, newtonRaphsonSolver);
        System.out.println("test newtonRaphson");
        System.out.println("function is sin(x).x - 3");
        System.out.println(univariateRealRootFinding.solve(-1, 20));
        //test bisection
//        univariateRealRootFinding.setRootSolver(bisectionSolver);
//        System.out.println("test bisection");
//        System.out.println("function is sin(x).x - 3");
//        System.out.println(univariateRealRootFinding.solve(6, 8));
//
//        //test secant
//        univariateRealRootFinding.setRootSolver(secantSolver);
//        System.out.println("test secant");
//        System.out.println("function is sin(x).x - 3");
//        System.out.println(univariateRealRootFinding.solve(-10, 20));
    }
}
