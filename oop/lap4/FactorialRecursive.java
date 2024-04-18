package hus.oop.lap4;

public class FactorialRecursive {
    public static void main(String[] args) {
        int n = 10;
        System.out.printf("Factorial of %d is %d", n, factorial(n));
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : (n * factorial(n - 1));
    }
}
