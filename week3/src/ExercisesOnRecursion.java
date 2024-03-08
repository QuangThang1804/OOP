import java.util.Scanner;

public class ExercisesOnRecursion {
    // 1.1
    public static int computeFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }

    public static void testFactorial() {
        int number = (int) (Math.random() * 13);
        System.out.println("The number is " + number);
        System.out.println("The value of factorial of number is " + computeFactorial(number));
    }

    // 1.2
    public static int findFibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n - 2) + findFibonacci(n - 1);
        }
    }

    public static void testFibonacci() {
        int number = (int) (Math.random() * 46);
        System.out.println("The number is " + number);
        System.out.println("The value of factorial of number is " + findFibonacci(number));
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
        System.out.printf("Length of S(%d) is: %d\n", num, len(num));
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
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.printf("GCD of %d and %d is: %d", number1, number2, findGcd(number1, number2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testFactorial();
        testFibonacci();
        testLen(input);
        testFindGcd(input);
    }
}
