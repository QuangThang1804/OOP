package hus.oop.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAXDENOMINATOR = 5000;
        double sumL2R = 0;
        double sumR2L = 0;
        double absDiff;

        // for-loop for summing from left-to-right
        for ( int denominator = 1; denominator<= MAXDENOMINATOR ; denominator++) {
            sumL2R += 1/denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        // for-loop for summing from right-to-left
        for ( int denominator = MAXDENOMINATOR; denominator>= 1 ; denominator--) {
            sumR2L += 1/denominator;
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);
        // Fine the absolute difference and display
        if ( sumL2R > sumR2L) {
            System.out.println("The summing from left-to-right more accurate the sum from right-to-left");
        } else if ( sumR2L > sumL2R) {
            System.out.println("The summing from right-to-left more accurate the sum from left-to-right");
        } else {
            System.out.println("summing from left-to-right as accurate as the sum from right-to-left");
        }
    }
}