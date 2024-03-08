// 3.1
import java.util.Scanner;

public class PerfectNumberList {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        boolean isPerfect;
        for (int num = 1; num <= aPosInt / 2; num++) {
            if (aPosInt % num == 0) {
                sum += num;
            }
        }
        return isPerfect = (sum == aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        boolean isDeficient;
        for (int num = 1; num <= aPosInt / 2; num++) {
            if (aPosInt % num == 0) {
                sum += num;
            }
        }
        return isDeficient = (sum < aPosInt);
    }

    public static void testPerfectAndDeficient(Scanner input) {
        System.out.print("Enter the upper bound: ");
        int boundNum = input.nextInt();
        int countPerfect = 0;
        int countNumNotPerfectAndDeficient = 0;
        StringBuilder listNumPerfect = new StringBuilder();
        StringBuilder listNumNotPerfectAndDef = new StringBuilder();
        for (int num = 1; num <= boundNum; num++) {
            if (isPerfect(num)) {
                listNumPerfect.append(num).append(" ");
                countPerfect++;
            } else if (!isDeficient(num)) {
                listNumNotPerfectAndDef.append(num).append(" ");
                countNumNotPerfectAndDeficient++;
            }
        }
        System.out.println("These numbers are perfect: ");
        System.out.println(listNumPerfect.toString());
        System.out.printf("[%d perfect numbers found (%.2f%%)]\n",
                countPerfect, ((double) (countPerfect) / boundNum * 100));
        System.out.println("These numbers are neither deficient not perfect:");
        System.out.println(listNumNotPerfectAndDef.toString());
        System.out.printf("[%d numbers found (%.2f%%)]\n",
                countNumNotPerfectAndDeficient,
                ((double) (countNumNotPerfectAndDeficient) / boundNum * 100));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testPerfectAndDeficient(input);
    }
}
