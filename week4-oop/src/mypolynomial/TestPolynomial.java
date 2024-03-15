package mypolynomial;

public class TestPolynomial {
    public static void main(String[] args) {
        MyPolynomial myPolynomial1 = new MyPolynomial(-1, 2, 3);
        System.out.println(myPolynomial1.toString());

        MyPolynomial myPolynomial2 = new MyPolynomial(-1, 2, 0, 0);
        System.out.println(myPolynomial2);

        System.out.println("degree is " + myPolynomial1.getDegree());
        System.out.println("evaluate of polynomial 1 with x = 2 is " + myPolynomial1.evaluate(2));
        System.out.println(myPolynomial1.add(myPolynomial2));
        MyPolynomial myPolynomialMulti = myPolynomial1.multiply(myPolynomial2);
        System.out.println(myPolynomialMulti);
    }
}
