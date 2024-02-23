import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your size: ");
        int size = checkPositiveNumber(input);
        printCheckerPattern(size);
    }

    public static int checkPositiveNumber(Scanner input) {
        int size = input.nextInt();
        while (size <= 0) {
            System.out.println("The size must be a positive number, please try another number");
            System.out.print("Enter your size: ");
            size = input.nextInt();
        }
        return size;
    }

    public static void printCheckerPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("#");
                    } else
                        System.out.print(" ");
                } else {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
        }
    }
}
