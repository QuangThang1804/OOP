package hus.week2.src;

import java.util.Locale;
import java.util.Scanner;

public class StringAndCharacterExercise {
    public static char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    // 1.1
    public static void testReverseString(Scanner input) {
        System.out.print("Enter a String: ");
        String inStr = input.nextLine();
        reverseString(inStr);
        System.out.println("The reverse of String \"" + inStr + "\" is \"" + reverseString(inStr) + "\"");
        System.out.println();
    }

    public static String reverseString(String inStr) {
        StringBuilder reverseStr = new StringBuilder();
        for (int i = inStr.length() - 1; i >= 0; i--) {
            reverseStr.append(inStr.charAt(i));
        }
        return reverseStr.toString();
    }

    // 1.2
    public static int countVowels(String inStr) {
        int countVowels = 0;
        String inStrLowerCase = inStr.toLowerCase();
        for (int i = 0; i < inStrLowerCase.length(); i++) {
            for (char vowel : vowels) {
                if (inStrLowerCase.charAt(i) == vowel) {
                    countVowels++;
                }
            }
        }
        return countVowels;
    }

    public static int countDigits(String inStr) {
        int countDigits = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if ((int) inStr.charAt(i) >= 48 && (int) inStr.charAt(i) <= 57) {
                countDigits++;
            }
        }
        return countDigits;
    }

    public static void testCountVowelsDigits(Scanner input) {
        System.out.print("Enter a String: ");
        String inStr = input.nextLine();
        double perOfCountVowels = (double) countVowels(inStr) / inStr.length() * 100;
        double perOfCountDigits = (double) countDigits(inStr) / inStr.length() * 100;

        System.out.printf("Number of vowvels: %d (%.2f%%) \n", countVowels(inStr), perOfCountVowels);
        System.out.printf("Number of digits: %d (%.2f%%) \n", countDigits(inStr), perOfCountDigits);
    }

    // 1.3

    public static String phoneKeyPadByNestedIf(String inStr) {
        StringBuilder strConvertToNum = new StringBuilder();
        String inStrLowerCase = inStr.toLowerCase();
        for (int i = 0; i < inStrLowerCase.length(); i++) {
            if ((int) inStrLowerCase.charAt(i) >= 97 && (int) inStrLowerCase.charAt(i) <= 99) {
                strConvertToNum.append(2);
            } else if ((int) inStrLowerCase.charAt(i) >= 100 && (int) inStrLowerCase.charAt(i) <= 102) {
                strConvertToNum.append(3);
            } else if ((int) inStrLowerCase.charAt(i) >= 103 && (int) inStrLowerCase.charAt(i) <= 105) {
                strConvertToNum.append(4);
            } else if ((int) inStrLowerCase.charAt(i) >= 106 && (int) inStrLowerCase.charAt(i) <= 108) {
                strConvertToNum.append(5);
            } else if ((int) inStrLowerCase.charAt(i) >= 109 && (int) inStrLowerCase.charAt(i) <= 111) {
                strConvertToNum.append(6);
            } else if ((int) inStrLowerCase.charAt(i) >= 112 && (int) inStrLowerCase.charAt(i) <= 115) {
                strConvertToNum.append(7);
            } else if ((int) inStrLowerCase.charAt(i) >= 116 && (int) inStrLowerCase.charAt(i) <= 118) {
                strConvertToNum.append(8);
            } else if ((int) inStrLowerCase.charAt(i) >= 119 && (int) inStrLowerCase.charAt(i) <= 122) {
                strConvertToNum.append(9);
            }
        }
        return strConvertToNum.toString();
    }

    public static String phoneKeyPadBySwitchCase(String inStr) {
        StringBuilder strConvertToNum = new StringBuilder();
        String inStrLowerCase = inStr.toLowerCase();
        for (int i = 0; i < inStrLowerCase.length(); i++) {
            switch (inStrLowerCase.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    strConvertToNum.append(2);
                    break;

                case 'd':
                case 'e':
                case 'f':
                    strConvertToNum.append(3);
                    break;

                case 'g':
                case 'h':
                case 'i':
                    strConvertToNum.append(4);
                    break;

                case 'l':
                case 'k':
                case 'j':
                    strConvertToNum.append(5);
                    break;

                case 'm':
                case 'n':
                case 'o':
                    strConvertToNum.append(6);
                    break;

                case 'p':
                case 'q':
                case 'r':
                case 's':
                    strConvertToNum.append(7);
                    break;

                case 't':
                case 'u':
                case 'v':
                    strConvertToNum.append(8);
                    break;

                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    strConvertToNum.append(9);
                    break;
            }
        }
        return strConvertToNum.toString();
    }

    public static void testPhoneKeyPad(Scanner input) {
        System.out.print("Enter a String: ");
        String phoneKeyPad = input.nextLine();
        System.out.println("Phone key pad by nested-if of String \"" + phoneKeyPad + "\" is " + phoneKeyPadByNestedIf(phoneKeyPad));
        System.out.println("Phone key pad by switch-case of String \"" + phoneKeyPad + "\" is " + phoneKeyPadBySwitchCase(phoneKeyPad));
    }

    // 1.4
    public static String cipherCaesarCode(String inStr) {
        StringBuilder strConvertToCipherCaesarCode = new StringBuilder();
        String inStrToUpperCase = inStr.toUpperCase();
        int n = 3;
        for (int i = 0; i < inStrToUpperCase.length(); i++) {
            if ((int) inStrToUpperCase.charAt(i) + n > 90) {
                char c = (char) ((int) inStrToUpperCase.charAt(i) + n - 25 - 1);
                strConvertToCipherCaesarCode.append(c);
            } else {
                char c = (char) ((int) inStrToUpperCase.charAt(i) + n);
                strConvertToCipherCaesarCode.append(c);
            }
        }
        return strConvertToCipherCaesarCode.toString();
    }

    public static void testCipherCaesarCode(Scanner input) {
        System.out.print("Enter a plaintext string: ");
        String plaintextString = input.nextLine();
        System.out.println("The ciphertext string is: " + cipherCaesarCode(plaintextString));
    }

    // 1.5
    public static String decipherCaesarCode(String inStr) {
        StringBuilder strConvertToCipherCaesarCode = new StringBuilder();
        String inStrToUpperCase = inStr.toUpperCase();
        int n = 3;
        for (int i = 0; i < inStrToUpperCase.length(); i++) {
            if ((int) inStrToUpperCase.charAt(i) - n < 65 ) {
                char c = (char) ((int) inStrToUpperCase.charAt(i) - n + 25 + 1);
                strConvertToCipherCaesarCode.append(c);
            } else {
                char c = (char) ((int) (inStrToUpperCase.charAt(i)) - n);
                strConvertToCipherCaesarCode.append(c);
            }
        }
        return strConvertToCipherCaesarCode.toString();
    }

    public static void testDecipherCaesarCode(Scanner input) {
        System.out.print("Enter a ciphertext string: ");
        String ciphertextString = input.nextLine();
        System.out.println("The plaintext string is: " + decipherCaesarCode(ciphertextString));
    }

    // 1.5
    public static boolean isHexString(String hexStr) {
        boolean isHexString = true;
        String hexStrToLowerCase = hexStr.toLowerCase();
        for (int i = 0; i < hexStrToLowerCase.length(); i++) {
            if (((int) hexStrToLowerCase.charAt(i) < 48)
            || ((int) hexStrToLowerCase.charAt(i) > 57 && (int) hexStrToLowerCase.charAt(i) < 97)
            || ((int) hexStrToLowerCase.charAt(i) > 102)) {
                isHexString = false;
            }
        }
        return isHexString;
    }

    public static void testHexString(Scanner input) {
        System.out.print("Enter a hex string: ");
        String inStr = input.nextLine();
        if (isHexString(inStr)) {
            System.out.println("\"" + inStr + "\" is a hex string");
        } else {
            System.out.println("\"" + inStr + "\" is not a hex string");
        }
    }

    // 1.7 nen lam de quy: n phep cong, n phep nhan
    public static int binaryToDecimal(String binStr) {
        int decimalNumber = 0;
        int lengthOfBinStr = binStr.length() - 1;
        for (int i = 0; i < binStr.length(); i++) {
            decimalNumber += (int) ((binStr.charAt(i) - 48) * Math.pow(2, lengthOfBinStr));
            lengthOfBinStr--;
        }

        return decimalNumber;
    }

    public static boolean isBinaryString(String binStr) {
        boolean isBinaryStr = true;
        for (int i = 0; i < binStr.length(); i++) {
            if (binStr.charAt(i) != '0' && binStr.charAt(i) != '1') {
                isBinaryStr = false;
            }
        }
        return isBinaryStr;
    }

    public static void testBinaryToDecimal(Scanner input) {
        System.out.print("Enter a Binary string: ");
        String binaryStr = input.nextLine();
        if (isBinaryString(binaryStr)) {
            System.out.println("The equivalent decimal number for binary \"" + binaryStr + "\" is: " + binaryToDecimal(binaryStr));
        } else {
            System.out.println("error: invalid binary string \"" + binaryStr + "\"");
        }
    }

    // 1.8
    public static int hexadecimalToDecimal(String hexStr) {
        int hexStrToDecimalNumber = 0;
        String hexStrToLower = hexStr.toLowerCase();
        int lengthHexStr = hexStr.length() - 1;
        for (int i = 0; i < hexStrToLower.length(); i++) {
            if (hexStrToLower.charAt(i) >= 48 && hexStrToLower.charAt(i) <= 57) {
                hexStrToDecimalNumber += (int) ((hexStrToLower.charAt(i) - 48) * Math.pow(16, lengthHexStr));
            } else if (hexStrToLower.charAt(i) >= 97 && hexStrToLower.charAt(i) <= 102){
                hexStrToDecimalNumber += (int) ((hexStrToLower.charAt(i) - 87) * Math.pow(16, lengthHexStr));
            }
            lengthHexStr--;
        }
        return hexStrToDecimalNumber;
    }

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

    public static void testHexadecimalToDecimal(Scanner input) {
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = input.nextLine();
        if (isHexString(inStr)) {
            System.out.println("The equivalent decimal number for hexadecimal \"" + inStr + "\" is: " + hexadecimalToDecimal(inStr));
        } else {
            System.out.println("error: invalid binary string \"" + inStr + "\"");
        }
    }

    // 1.9
    public static int octalToDecimal(String octalStr) {
        int octalStrToDecimalNumber = 0;
        String octalStrToLower = octalStr.toLowerCase();
        int lengthOctalStr = octalStr.length() - 1;
        for (int i = 0; i < octalStrToLower.length(); i++) {
            if (octalStrToLower.charAt(i) >= 48 && octalStrToLower.charAt(i) <= 55) {
                octalStrToDecimalNumber += (int) ((octalStrToLower.charAt(i) - 48) * Math.pow(8, lengthOctalStr));
            }
            lengthOctalStr--;
        }
        return octalStrToDecimalNumber;
    }

    public static void testOctalToDecimal(Scanner input) {
        System.out.print("Enter an Octal string: ");
        String inStr = input.nextLine();
        System.out.println("The equivalent decimal number \"" + inStr + "\" is: " + octalToDecimal(inStr));
    }

    // 1.10
    public static int radixNToDecimal(String radixNStr, int radix) {
        int radixNStrToDecimalNumber = 0;
        String radixNStrToLower = radixNStr.toLowerCase();
        int lengthradixNStr = radixNStr.length() - 1;
        for (int i = 0; i < radixNStrToLower.length(); i++) {
            if (radixNStrToLower.charAt(i) >= 48 && radixNStrToLower.charAt(i) <= 57 + radix - 16) {
                radixNStrToDecimalNumber += (int) ((radixNStrToLower.charAt(i) - 48) * Math.pow(radix, lengthradixNStr));
            } else if (radixNStrToLower.charAt(i) >= 97 && radixNStrToLower.charAt(i) <= 102 + radix - 16) {
                radixNStrToDecimalNumber += (int) ((radixNStrToLower.charAt(i) - 87) * Math.pow(radix, lengthradixNStr));
            }
            lengthradixNStr--;
        }
        return radixNStrToDecimalNumber;
    }

    public static void testRadixNToDecimal(Scanner input) {
        System.out.print("Enter the radix: ");
        int radix = input.nextInt();
        input.nextLine();
        System.out.print("Enter the String: ");
        String inStr = input.nextLine();
        System.out.println("The equivalent decimal number \"" + inStr + "\" is: " + radixNToDecimal(inStr, radix));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ex1.1: ");
        testReverseString(input);
        System.out.println("Ex1.2: ");
        testCountVowelsDigits(input);
        System.out.println("Ex1.3: ");
        testPhoneKeyPad(input);
        System.out.println("Ex1.4: ");
        testCipherCaesarCode(input);
        System.out.println("Ex1.5: ");
        testDecipherCaesarCode(input);
        System.out.println("Ex1.6: ");
        testHexString(input);
        System.out.println("Ex1.7: ");
        testBinaryToDecimal(input);
        System.out.println("Ex1.8: ");
        testHexadecimalToDecimal(input);
        System.out.println("Ex1.9: ");
        testOctalToDecimal(input);
        System.out.println("Ex1.10: ");
        testRadixNToDecimal(input);
    }
}
