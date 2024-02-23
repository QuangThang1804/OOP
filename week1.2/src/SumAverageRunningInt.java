//3.1
public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        System.out.println("Count by for loop");
        countSumAverageByForLoop(LOWERBOUND, UPPERBOUND);
        System.out.println();

        System.out.println("Count by while-do");
        countSumAverageByWhileDo(LOWERBOUND, UPPERBOUND);
        System.out.println();

        System.out.println("Count by do-while");
        countSumAverageByDoWhile(LOWERBOUND, UPPERBOUND);
        System.out.println();

        countSumAverageFrom111To8899();
        System.out.println();

        countSumOfOddAndEven(LOWERBOUND, UPPERBOUND);
    }

    public static void countSumAverageByForLoop(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        double average;
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sum += i;
        }
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }

    public static void countSumAverageByWhileDo(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        double average;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            sum += number;
            ++ number;
        }
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }

    public static void countSumAverageByDoWhile(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        double average;
        int number = LOWERBOUND;
        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }

    public static void countSumAverageFrom111To8899() {
        int sum = 0;
        double average;
        int count = 0;
        for (int i = 111; i <= 8899; i++) {
            sum += i;
            ++ count;
        }
        average = (double) sum / count;
        System.out.println("The sum of 111 to 8899 is " + sum);
        System.out.println("The average is " + average);
    }

    public static void sumOFTheSquares(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sum += i * i;
        }
        System.out.println("The sum of the squares from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }

    public static void countSumOfOddAndEven(int LOWERBOUND, int UPPERBOUND) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.println("The sum of odd number is " + sumOdd);
        System.out.println("The sum of even number is " + sumEven);
        System.out.println("Their absolute difference is " + absDiff);
    }
}
