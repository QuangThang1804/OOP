import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        while (size <= 0) {
            System.out.println("The size must be a positive number, please enter the other number");
            System.out.print("Enter the size: ");
            size = input.nextInt();
        }
        printTimeTable(size);
    }

    public static void printTimeTable(int size) {
        for (int row = 0; row <= size + 1; row++) {
            for (int col = 0; col <= size; col++) {
                if (row == 0) {
                    if (col == 0) {
                        System.out.printf("%2s%2s", "*", "|");
                    } else
                        System.out.printf("%4d", col);
                } else if (row == 1) {
                        System.out.print("----");
                } else {
                    if (col == 0) {
                        System.out.printf("%2d%2s", row - 1, "|");
                    } else {
                        System.out.printf("%4d", (row - 1) * col);
                    }
                }
            }
            System.out.println();
        }
    }
}
