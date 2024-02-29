import java.util.Scanner;

public class MathLibraryHomework {
    // 5.1 Can use another solution
    public static double computeFactorial(int number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static double sin(double x, int numTerms) {
        double result = 0;
        for (int i = 1; i <= numTerms * 2; i += 2) {
            if (i % 4 == 1) {
                result += Math.pow(x, i) / (computeFactorial(i));
            } else if (i % 4 == 3) {
                result -= Math.pow(x, i) / computeFactorial(i);
            }
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0;
        for (int i = 0; i <= numTerms * 2; i += 2) {
            if (i % 4 == 0) {
                result += Math.pow(x, i) / (computeFactorial(i));
            } else if (i % 4 == 2) {
                result -= Math.pow(x, i) / computeFactorial(i);
            }
        }
        return result;
    }

    public static void testTrigonometric(Scanner input) {
        System.out.print("Enter the number x: ");
        double x = input.nextDouble();
        System.out.print("Enter the number of terms: ");
        int numTerms = input.nextInt();
        System.out.println("The value of sin(" + x + ") is: " + sin(x, numTerms));
        System.out.println("The value of cos(" + x + ") is: " + cos(x, numTerms));
    }

    // 5.2
    public static double computeDevide(int numTerms) {
        double resultOfDevide = 1;
        if (numTerms == 1) {
            return resultOfDevide;
        } else {
            for (double idx = 1; idx <= (double) numTerms; idx++) {
                if (idx % 2 == 0) {
                    resultOfDevide /= idx;
                } else {
                    resultOfDevide *= idx;
                }
            }
        }
        return resultOfDevide;
    }
    public static double specialSeries(double x, int numTerms) {
        double resultOfSeries = 0;
        for (int idx = 1; idx <= numTerms * 2; idx += 2) {
            resultOfSeries += (Math.pow(x, idx) / idx) * computeDevide(idx - 1);
        }
        return resultOfSeries;
    }

    public static void testSpecialSeries(Scanner input) {
        System.out.print("Enter the number x (-1 <= x <= 1): ");
        double x = input.nextDouble();
        System.out.print("Enter the number of terms: ");
        int numTerms = input.nextInt();
        System.out.println("Result of special series" + " is " + specialSeries(x, numTerms));
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        testTrigonometric(input);
        testSpecialSeries(input);
    }
}
