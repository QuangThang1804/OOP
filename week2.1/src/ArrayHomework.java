import java.util.Scanner;

public class ArrayHomework {
    public static int enterNonNegativeNumber(Scanner input) {
        int number = input.nextInt();
        while (number < 0) {
            System.out.println("The size must be a positive number, please try another number");
            System.out.print("Enter your size: ");
            number = input.nextInt();
        }
        return number;
    }

    public static String printItemInStars(int number) {
        StringBuilder itemInStars = new StringBuilder();
        for (int idx = 1; idx <= number; idx++) {
            itemInStars.append("*");
        }
        return itemInStars.append("(").append(number).append(")").toString();
    }
    public static void printArrayInStars(Scanner input) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = enterNonNegativeNumber(input);
        int[] items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int idx = 0; idx < items.length; idx++) {
            items[idx] = input.nextInt();
        }

        for (int idx = 0; idx < items.length; idx++) {
            System.out.println(idx + ": " + printItemInStars(items[idx]));;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printArrayInStars(input);
    }
}
