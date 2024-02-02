import java.util.Scanner;

// 4.1
public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        int number1st = input.nextInt();

        System.out.print("Enter the 2nd integer: ");
        int number2nd = input.nextInt();

        System.out.print("Enter the 3rd integer: ");
        int number3rd = input.nextInt();

        countSum(number1st, number2nd, number3rd);
        countProduct(number1st, number2nd, number3rd);
        findMin(number1st, number2nd, number3rd);
        findMax(number1st, number2nd, number3rd);

    }

    public static void countSum(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        System.out.println("The sum is " + sum);
    }

    public static void countProduct(int number1, int number2, int number3) {
        int product = number1 * number2 * number3;
        System.out.println("The product is " + product);
    }

    public static void findMin(int number1, int number2, int number3) {
        int min = number1;
        if (number2 > min) {
            min = number2;
        }
        if (number3 > min) {
            min = number3;
        }
        System.out.println("The min is " + min);
    }

    public static void findMax(int number1, int number2, int number3) {
        int max = number1;
        if (number2 < max) {
            max = number2;
        }
        if (number3 < max) {
            max = number3;
        }
        System.out.println("The max is " + max);
    }
}
