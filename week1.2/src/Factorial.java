// 1.1
public class Factorial {
    public static void main(String[] args) {
      long n = 20;
      long facorial = computeFactorial(n);

      System.out.println("The factorial of " + n + " is: " + facorial);
    }

    public static long computeFactorial(long number) {
        long factorial = 1;

        for (long i = 1; i <= 20; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
