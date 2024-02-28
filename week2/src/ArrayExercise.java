package hus.week2.src;

import java.util.Scanner;

public class ArrayExercise {
    final static String [ ] HEXBITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};
    // 2.1
    public static int[] createArray(Scanner input) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = input.nextInt();
        System.out.print("Enter the value of all items (seperated by space): ");
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < items.length; i++) {
            items[i] = input.nextInt();
        }
        return items;
    }

    public static void printArray(int[] array) {
        System.out.print("The values are: [");
        if (array.length == 1) {
            System.out.println(array[0] + "]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i] + "]");
                }
            }
        }
        System.out.println();
    }

    // 2.2
    public static int[] generateStudentGrade(Scanner input) {
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] arrStudents = new int[numStudents];
        for (int i = 0; i < arrStudents.length; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            arrStudents[i] = input.nextInt();
        }
        return arrStudents;
    }

    public static void simpleGradesStatistics(int[] grades) {
        int sum = 0;
        double average;
        int max = grades[0];
        int min = grades[0];

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        average = (double) sum / grades.length;

        for (int grade : grades) {
            if (max < grade) {
                max = grade;
            }

            if (min > grade) {
                min = grade;
            }
        }

        System.out.printf("The average is: %.2f\n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }

    //2.3
    public static boolean checkHexStr(String hexStr) {
        boolean isHexStr = true;
        for (int i = 0; i < hexStr.length(); i++) {
            if (hexStr.charAt(i) < 47
                    || (hexStr.charAt(i) > 57 && hexStr.charAt(i) < 65)
                    || (hexStr.charAt(i) > 70 && hexStr.charAt(i) < 97)
                    || (hexStr.charAt(i) > 102)) {
                isHexStr = false;
            }
        }
        return isHexStr;
    }
    public static String hexadecimalToBinary(String hexStr) {
        StringBuilder binStr = new StringBuilder();
        String hexStrLowerCase = hexStr.toLowerCase();
        for (int i = 0; i < hexStrLowerCase.length(); i++) {
            if (hexStrLowerCase.charAt(i) >= 48 && hexStrLowerCase.charAt(i) <= 57) {
                binStr.append(HEXBITS[hexStrLowerCase.charAt(i) - 48] + " ");
            } else if (hexStrLowerCase.charAt(i) >= 97 && hexStrLowerCase.charAt(i) <= 102) {
                binStr.append(HEXBITS[hexStrLowerCase.charAt(i) - 87] + " ");
            }
        }
        return binStr.toString();
    }

    public static void testHexadecimalToBinary(Scanner input) {
        System.out.print("Enter a Hexadecimal string: ");
        input.nextLine();
        String hexStr = input.nextLine();
        if (checkHexStr(hexStr)) {
            System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + hexadecimalToBinary(hexStr));
        } else {
            System.out.println("error: invalid hexadecimal string \"" + hexStr + "\"");
        }
    }

    // 2.4
    public static String decimalToHexadecimal(int positiveInteger) {
        StringBuilder hexStr = new StringBuilder();
        int copyOfPosInt = positiveInteger;
        int quotient;
        int remainder;
        char intToChar;
        while (copyOfPosInt != 0) {
            quotient = copyOfPosInt / 16;
            remainder = copyOfPosInt % 16;
            if (remainder >= 0 && remainder <= 9) {
                hexStr.append(remainder);
            } else {
                intToChar = (char) (remainder + 55);
                hexStr.append(intToChar);
            }
            copyOfPosInt = quotient;
        }
        return hexStr.reverse().toString();
    }

    public static void testDecimalToHexadecimal(Scanner input) {
        System.out.print("Enter a decimal number: ");
        int posNumber = input.nextInt();
        if (posNumber > 0) {
            System.out.println("The equivalent hexadecimal number is: " + decimalToHexadecimal(posNumber));
        } else {
            System.out.println("Error: the number must be a positive number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ex2.1: ");
        printArray(createArray(input));
        System.out.println("Ex2.2: ");
        simpleGradesStatistics(generateStudentGrade(input));
        System.out.println("Ex2.3: ");
        testHexadecimalToBinary(input);
        System.out.println("Ex2.4: ");
        testDecimalToHexadecimal(input);
    }
}
