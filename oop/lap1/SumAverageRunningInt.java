package hus.oop.lab1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        System.out.println("Sum average using while loop" +
                sumAverageUsingWhileLoop(LOWERBOUND,UPPERBOUND));
        System.out.println("Sum average using for loop" + sumAverageUsingForLoop(LOWERBOUND, UPPERBOUND));
        }

    public static double sumAverageUsingForLoop(int lowerBound,
                                         int upperBound) {
        int sum = 0;
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }

    public static double sumAverageUsingWhileLoop (int lowerBound,
                                                    int upperBound){
        int sum = 0;
        int count = 0;
        int index = lowerBound;
        while (index <= upperBound){
            sum += index;
            count++;
            index++;
        }
        return (double) sum /count;
    }
}
