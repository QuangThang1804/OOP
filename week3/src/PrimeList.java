import java.util.Scanner;

// 3.2
public class PrimeList {
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

    public static void testPrime(Scanner input) {
        System.out.print("Enter the upper bound: ");
        int boundNum = input.nextInt();
        int countPrime = 0;
        for (int num = 1; num <= boundNum; num++) {
            if (isPrime(num)) {
                System.out.println(num);
                countPrime++;
            }
        }
        System.out.printf("[%d primes found (%.2f%%)]\n",
                countPrime, ((double) (countPrime) / boundNum * 100));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testPrime(input);
    }
}
