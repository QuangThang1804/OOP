package poly;

public class TestPolynominal {
    public static void main(String[] args) {
        testArrayPolynominal();
        testListPolynominal();
        testRootSolve();
    }

    public static void testArrayPolynominal() {
        ArrayPolynominal ap1 = new ArrayPolynominal();
        ap1.append(0);
        ap1.append(2);
        ap1.append(-3);
        ap1.append(1);
        ap1.append(0);
        System.out.println(ap1.toString());

        ArrayPolynominal ap2 = new ArrayPolynominal();
        ap2.append(0);
        ap2.append(0);
        ap2.append(6);
        ap2.append(-5);
        ap2.append(1);
        System.out.println(ap2);

        System.out.println(ap1.plus(ap2));
        System.out.println(ap1.minus(ap2));
        System.out.println(ap1.multiply(ap2));
        System.out.println();
    }

    public static void testListPolynominal() {
        ListPolynominal lp1 = new ListPolynominal();
        lp1.append(0);
        lp1.append(2);
        lp1.append(-3);
        lp1.append(1);
        lp1.append(0);
        System.out.println(lp1);

        ListPolynominal lp2 = new ListPolynominal();
        lp2.append(0);
        lp2.append(0);
        lp2.append(6);
        lp2.append(-5);
        lp2.append(1);
        System.out.println(lp2);
        System.out.println(lp1.plus(lp2));
        System.out.println(lp1.minus(lp2));
        System.out.println(lp1.multiply(lp2));
        System.out.println();
    }

    public static void testRootSolve() {
        ArrayPolynominal ap1 = new ArrayPolynominal();
        ap1.append(0);
        ap1.append(2);
        ap1.append(-3);
        ap1.append(1);
        ap1.append(0);
        System.out.println(ap1);

        PolynominalRootFinding polyRoot = new PolynominalRootFinding(ap1);
        polyRoot.setRootSolver(new NewtonRaphsonSolver(100, 100));
        // test with Newton
        System.out.println(polyRoot.solve(1, 5));

        polyRoot.setRootSolver(new SecantSolver(100, 100));
        // test with Newton
        System.out.println(polyRoot.solve(-1, 2));

        polyRoot.setRootSolver(new BiSectionSolver(100, 100));
        // test with Newton

        // Nhap a, b sao cho f(a) < 0 va f(b) > 0
        System.out.println(polyRoot.solve(-1, 5));

    }
}
