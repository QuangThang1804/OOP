// 3.3
public class ComputePI {
    public static void main(String[] args) {
        int[] maxDenominator = {1000, 10000, 100000, 1000000};
        for (int i = 0; i < maxDenominator.length; i++) {
            computePI(maxDenominator[i]);
            computePIByMaxTerm(maxDenominator[i]);
        }
    }

    public static void computePI(int maxDenominator) {
        double pi = 0;
        for (double j = 1; j <= maxDenominator; j++) {
            if (j % 4 == 1) {
                pi += 4 * (1 / j);
            } else if (j % 4 == 3) {
                pi -= 4 * (1 / j);
            }
        }
        System.out.println("Value of Pi with max denominator of " + maxDenominator + " is " + pi);
        System.out.println("Compare with Math.PI " + compare(pi));
        System.out.println();
    }

    public static void computePIByMaxTerm(int maxTerm) {
        double sum = 0;
        for (int i = 1; i <= maxTerm; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / (i * 2 - 1);
            } else {
                sum -= 1.0 / (i * 2 - 1);
            }
        }
        sum *= 4;
        System.out.println("Value of Pi with max term of " + maxTerm + " is " + sum);
        System.out.println("Compare with Math.PI " + compare(sum));
        System.out.println();
    }

    public static double compare(double computePI) {
        return computePI / Math.PI * 100;
    }
}
