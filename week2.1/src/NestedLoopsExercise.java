import java.util.Scanner;

public class NestedLoopsExercise {
    // 2.1
    public static void printSquarePatternByForLoop(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printSquarePatternByWhile(int size) {
        int copySize = size;
        int copySize2 = size;
        while (copySize > 0) {
            while (copySize2 > 0) {
                System.out.print("# ");
                copySize2--;
            }
            copySize2 = size;
            System.out.println();
            copySize--;
        }
    }

    public static void testSquarePattern(Scanner input) {
        System.out.print("Enter the size: ");
        int size = enterNonNegativeNumber(input);

        System.out.println("Print Square Pattern by using nested for-loops");
        printSquarePatternByForLoop(size);
        System.out.println();
        System.out.println("Print Square Pattern by using while-do loops");
        printSquarePatternByWhile(size);
    }

    // 2.2
    public static int enterNonNegativeNumber(Scanner input) {
        int number = input.nextInt();
        while (number < 0) {
            System.out.println("The size must be a positive number, please try another number");
            System.out.print("Enter your size: ");
            number = input.nextInt();
        }
        return number;
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

    public static void testCheckerPattern(Scanner input) {
        System.out.print("Enter your size: ");
        int size = enterNonNegativeNumber(input);
        printCheckerPattern(size);
    }

    // 2.3
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

    public static void testTimeTable(Scanner input) {
        System.out.print("Enter the size: ");
        int size = enterNonNegativeNumber(input);
        printTimeTable(size);
    }

    // 2.4
    public static void triangularPatternX(int number) {
        String spaceStr = "%" + number + "s\n";
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.printf(spaceStr, "(a)");

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row <= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.printf(spaceStr, "(b)");

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (col >= row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.printf(spaceStr, "(c)");

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (col >= number - row + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.printf(spaceStr, "(d)");
    }

    public static void testTriangularPatternX(Scanner input) {
        System.out.print("Enter the size: ");
        int size = enterNonNegativeNumber(input);
        triangularPatternX(size);
    }

    // 2.5
    public static void boxPattern(int number) {
        String spaceStr = "%" + number + "s\n";
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number) {
                    System.out.print("# ");
                } else {
                    if (col == 1 || col == number) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr, "(a)");

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr, "(b)");

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == number - row + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr, "(c)");

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || row == col || col == number - row + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr, "(d)");
    }

    public static void testBoxPattern(Scanner input) {
        System.out.print("Enter the size: ");
        int size = enterNonNegativeNumber(input);
        boxPattern(size);
    }

    // 2.6
    public static void hillPatternX(int numRow) {
        String spaceStr = "%" + numRow * 2 + "s\n";
        int numCol = 2 * numRow - 1;
        for (int row = 1; row <= numRow; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((col + row >= numRow + 1) && (row >= col - numRow + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr, "(a)");

        for (int row = 1; row <= numRow; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((col >= row) && (row + col <= numCol + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr, "(b)");

        for (int row = 1; row <= numRow * 2 - 1; row++) {
            for (int col = 1; col <= numCol; col++) {
                if (row <= numRow) {
                    if ((col + row >= numRow + 1) && (row >= col - numRow + 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if ((col >= row - numRow + 1) && (row - numRow + 1 + col <= numCol + 1)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr,"(c)");

        for (int row = 1; row <= numRow * 2 - 1; row++) {
            for (int col = 1; col <= numCol; col++) {
                if (row <= numRow) {
                    if ((col + row >= numRow + 2) && (row >= col - numRow + 2)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("# ");
                    }
                } else {
                    if ((col >= row - numRow + 2) && (row - numRow + col <= numCol - 1)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("# ");
                    }
                }
            }
            System.out.println();
        }
        System.out.printf(spaceStr, "(d)");

    }

    public static void testHillPatternX(Scanner input) {
        System.out.print("Enter the size: ");
        int size = enterNonNegativeNumber(input);
        hillPatternX(size);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testSquarePattern(input);
        testCheckerPattern(input);
        testTimeTable(input);
        testTriangularPatternX(input);
        testBoxPattern(input);
        testHillPatternX(input);
    }
}
