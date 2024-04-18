package hus.oop.lap2;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Enter the size: ");
        printTrianularPatternD(size);
        printTrianularPatternA(size);
        printTrianularPatternB(size);
        printTrianularPatternC(size);
    }

    private static void printTrianularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row <= col)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    private static void printTrianularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row + col <= size + 1)
                    System.out.print("# ");
            System.out.println();
        }
        System.out.println();
    }

    private static void printTrianularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row + col >= size + 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    private static void printTrianularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row >= col)
                    System.out.print("# ");
            System.out.println();
        }
        System.out.println();
    }
}
/*
size = 7
Enter the size:
            #
          # #
        # # #
      # # # #
    # # # # #
  # # # # # #
# # # # # # #    C

#
# #
# # #
# # # #
# # # # #
# # # # # #
# # # # # # #    B

# # # # # # #
# # # # # #
# # # # #
# # # #
# # #
# #
#                A

# # # # # # #
  # # # # # #
    # # # # #
      # # # #
        # # #
          # #
            #    D

 */