// 1.1
public class Factorial {
    public static void main(String[] args) {
      long n = 20;
      long facorial = 1;

      for (long i = 1; i <= 20; i++) {
          facorial *= i;
      }
      System.out.println("The factorial of " + n + " is: " + facorial);
    }
}
