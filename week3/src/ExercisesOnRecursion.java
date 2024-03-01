import java.util.Scanner;

public class ExercisesOnRecursion {
    // 1.1
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 1.2
    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    // 1.3
    public static int numOfDigits(int num) {
        String digitsToStr = Integer.toString(num);
        return digitsToStr.length();
    }

    public static int len(int num) {
        if (num == 1) {
            return 1;
        } else {
            return len(num - 1) + numOfDigits(num);
        }
    }

    public static void testLen(Scanner input) {
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        System.out.printf("Length of S(%d) is: %d", num, len(num));
    }

    // 1.4
    public static int findGcd(int a, int b) {
        int gcd = -1;
        if (b == 0) {
            return gcd = a;
        } else if (b > 0) {
            return gcd = findGcd(b, a % b);
        }
        return gcd;
    }

    public static void testFindGcd(Scanner input) {
        System.out.print("Enter two number: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.printf("GCD of %d and %d is: %d", number1, number2, findGcd(number1, number2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testLen(input);
        testFindGcd(input);
    }
}
