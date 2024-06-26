package hus.oop.lap2;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        System.out.print("   * |\t ");
        for (int col = 1; col <= size; col++) {
            System.out.printf("%4d \t", col);
        }
        System.out.print("\n");
        for (int col = 1; col <= 3 * size; col++) {
            System.out.print("-- ");
        }
        System.out.print("\n");
        for (int row = 1; row <= size; row++) {
            System.out.printf("%4d |\t ", row);
            for (int col = 1; col <= size; col++) {
                int product = row * col;
                System.out.printf("%4d \t", product);
            }
            System.out.print("\n");
        }
    }
}

