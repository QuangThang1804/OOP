import java.util.Scanner;

// 4.5
public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int positiveNumber = in.nextInt();

        if (positiveNumber > 0) {
            reverseNumber(positiveNumber);
        }

    }

    public static void reverseNumber(int number) {
        int copyNumber = number;
        System.out.print("The reverse is: ");
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            System.out.print(digit);
            copyNumber = copyNumber / 10;
        }
    }
}
