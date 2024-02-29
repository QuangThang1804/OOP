import java.util.Scanner;

public class MathLibraryHomework {
    // 5.1
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

    // 5.3
    public static int factorialInt(int number) {
        int resultOfFacNum = 1;
        for (int i = 1; i <= number; i++) {
            resultOfFacNum *= i;
        }
        return resultOfFacNum;
    }

    public static void testFactorialInt() {
        for (int num = 1; num < Integer.MAX_VALUE; num++) {
            if ((Integer.MAX_VALUE / factorialInt(num - 1)) < num) {
                System.out.println("The factorial of " + num + " is out of range");
                break;
            } else {
                System.out.println("The factorial of " + num + " is " + factorialInt(num));
            }
        }
    }

    // 5.4
    public static int computeFinonacciInt(int number) {
        int result;
        if (number == 0 || number == 1) {
            result = 1;
        } else {
            result = computeFinonacciInt(number - 2) + computeFinonacciInt(number - 1);
        }
        return result;
    }

    public static void testFibonacciInt() {
        for (int num = 0; num < Integer.MAX_VALUE; num++) {
            if (num < 2 || Integer.MAX_VALUE - computeFinonacciInt(num - 1) >= computeFinonacciInt(num - 2)) {
                System.out.println("F(" + num + ") = " + computeFinonacciInt(num));
            } else {
                System.out.println("F(" + (num) + ") is out of range of int");
                break;
            }
        }
    }

    // 5.5
    public static int radixNToDecimal(String radixNStr, int radix) {
        int radixNStrToDecimalNumber = 0;
        String radixNStrToLower = radixNStr.toLowerCase();
        int lengthradixNStr = radixNStr.length() - 1;
        for (int i = 0; i < radixNStrToLower.length(); i++) {
            if (radixNStrToLower.charAt(i) >= 48 && radixNStrToLower.charAt(i) <= 57 + radix - radix) {
                radixNStrToDecimalNumber += (int) ((radixNStrToLower.charAt(i) - 48) * Math.pow(radix, lengthradixNStr));
            } else if (radixNStrToLower.charAt(i) >= 97 && radixNStrToLower.charAt(i) <= 102 + radix - radix) {
                radixNStrToDecimalNumber += (int) ((radixNStrToLower.charAt(i) - 87) * Math.pow(radix, lengthradixNStr));
            }
            lengthradixNStr--;
        }
        return radixNStrToDecimalNumber;
    }

    public static String decimalToRadixN(int decimalNumber, int radix) {
        StringBuilder decimalToRadixNStr = new StringBuilder();
        int copyOfPosInt = decimalNumber;
        int quotient;
        int remainder;
        char intToChar;
        while (copyOfPosInt != 0) {
            quotient = copyOfPosInt / radix;
            remainder = copyOfPosInt % radix;
            if (remainder >= 0 && remainder <= 9) {
                decimalToRadixNStr.append(remainder);
            } else {
                intToChar = (char) (remainder + 55);
                decimalToRadixNStr.append(intToChar);
            }
            copyOfPosInt = quotient;
        }
        return decimalToRadixNStr.reverse().toString();
    }
    public static String toRadix(String inStr, int inRadix, int outRadix) {
        return decimalToRadixN(radixNToDecimal(inStr, inRadix), outRadix);
    }

    public static void testToRadix(Scanner input) {
        System.out.print("Enter a number and radix: ");
        String inStr = input.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = input.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = input.nextInt();
        System.out.printf("\"%s\" in radix %d is \"%s\" in radix %d", inStr, inRadix,
                toRadix(inStr, inRadix, outRadix), outRadix);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testTrigonometric(input);
        testSpecialSeries(input);
        testFactorialInt();
        testFibonacciInt();
        testToRadix(input);
    }
}
