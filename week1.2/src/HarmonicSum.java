// 3.2
public class HarmonicSum {
    public static void main(String[] args) {
        double sumR2L = 0;
        double sumL2R = 0;
        double MAXDENOMINATOR = 50000;

        sumR2L = computeSumR2L(MAXDENOMINATOR);

        sumL2R = computeSumL2R(MAXDENOMINATOR);

        double absDiff = (sumL2R > sumR2L) ? sumL2R - sumR2L : sumR2L - sumL2R;

        System.out.println("The sum from left to right is " + sumL2R);
        System.out.println("The sum from right to left is " + sumR2L);
        System.out.println("Their absolute different is " + absDiff);
    }

    public static double computeSumR2L(double MAXDENOMINATOR) {
        double sumR2L = 0;
        for (double i = 1; i <= MAXDENOMINATOR; i++) {
            sumR2L += 1 / i;
        }
        return sumR2L;
    }

    public static double computeSumL2R(double MAXDENOMINATOR) {
        double sumL2R = 0;
        for (double i = 50000; i >= 1; i--) {
            sumL2R += 1 / i;
        }
        return sumL2R;
    }
}
