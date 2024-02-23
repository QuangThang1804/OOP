import java.util.Scanner;

// 1.1
public class SquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        if (size >= 0) {
            System.out.println("Print Square Pattern by using nested for-loops");
            printSquarePatternByForLoop(size);
            System.out.println();
            System.out.println("Print Square Pattern by using while-do loops");
            printSquarePatternByWhile(size);
        }
    }

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
}
