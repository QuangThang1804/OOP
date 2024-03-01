import java.util.Scanner;

// 3.3
public class PerfectPrimeFactorList {
    public static boolean isPrime(int inPosInt) {
        boolean isPrime = true;
        if (inPosInt == 1) {
            isPrime = false;
        } else {
            for (int num = 2; num <= Math.sqrt(inPosInt); num++) {
                if (inPosInt % num == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
    public static boolean isProductOfPrimeFactors(int inPosInt) {
        boolean isProductOfPrimeFactors;
        int copyOfPosInt = inPosInt;
        for (int i = 2; i <= inPosInt / 2; i++) {
            if (isPrime(i) && inPosInt % i == 0) {
                copyOfPosInt /= i;
            }
        }
        return isProductOfPrimeFactors = (copyOfPosInt == 1);
    }

    public static void testProductOfPrimeFactors(Scanner input) {
        System.out.print("Enter the upper bound: ");
        int boundNum = input.nextInt();
        int countPrimeFactors = 0;
        System.out.println("These numbers are equal to the product of prime factors:");
        for (int num = 2; num <= boundNum; num++) {
            if (isProductOfPrimeFactors(num)) {
                System.out.print(num + " ");
                countPrimeFactors++;
            }
        }
        System.out.println();
        System.out.printf("[%d numbers found (%.2f%%)]\n",
                countPrimeFactors, ((double) (countPrimeFactors) / boundNum * 100));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testProductOfPrimeFactors(input);
    }
}
