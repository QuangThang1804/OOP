package hus.week2.src;

import java.util.Scanner;

public class MethodExercise {
    // 3.1
    public static int exponent(int base, int exp) {
        int result = 0;
        int halfOfExp;
        int resultOfHalfOfExpToBase;
        if (exp == 0) {
            result = 1;
        } else if (exp == 1) {
            result = base;
        } else if (exp % 2 == 0) {
            halfOfExp = exp / 2;
            resultOfHalfOfExpToBase = exponent(base, halfOfExp);
            result = resultOfHalfOfExpToBase * resultOfHalfOfExpToBase;
        } else {
            halfOfExp = exp / 2;
            resultOfHalfOfExpToBase = exponent(base, halfOfExp);
            result = base * resultOfHalfOfExpToBase * resultOfHalfOfExpToBase;
        }
        return result;
    }

    public static void testExponent(Scanner input) {
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = input.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    //3.2
    public static boolean hasEight(int number) {
        boolean hasEight = false;
        int copyOfNumber = number;
        int digit;
        while (copyOfNumber != 0) {
            digit = copyOfNumber % 10;
            if (digit == 8) {
                hasEight = true;
                break;
            }
            copyOfNumber = copyOfNumber / 10;
        }
        return hasEight;
    }

    public static void testMagicSum(Scanner input) {
        int sum = 0;
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = input.nextInt();
        while (number != -1) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = input.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
    }

    // 3.3
    public static int[] generateArray(Scanner input) {
        System.out.print("Enter the length of array: ");
        int lengthOfArray = input.nextInt();
        int[] items = new int[lengthOfArray];
        for (int i = 0; i < items.length; i++) {
            items[i] = (int) (Math.random() * 10);
        }
        return items;
    }

    public static void print(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.println("]");
        } else if (array.length == 1) {
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
    }

    public static void testPrintArray(Scanner input) {
        int[] emptyArr = new int[0];
        int[] oneElementArr = {(int) (Math.random() * 10)};
        int[] nElementsArr = generateArray(input);
        System.out.print("Print empty array: ");
        print(emptyArr);
        System.out.print("Print one-element array: ");
        print(oneElementArr);
        System.out.print("Print n-element array: ");
        print(nElementsArr);
        System.out.println();
    }

    public static void print(double [] array) {
        System.out.print("[");
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
    }

    public static void print(float [] array) {
        System.out.print("[");
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
    }

    // 3.4
    public static String arrayToString(int[] array) {
        StringBuilder arrToStr = new StringBuilder();
        arrToStr.append("[");
        if (array.length == 0) {
            arrToStr.append("]");
        } else if (array.length == 1) {
            arrToStr.append(array[0]).append("]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1) {
                    arrToStr.append(array[i]).append(", ");
                } else {
                    arrToStr.append(array[i]).append("]");
                }
            }
        }
        return arrToStr.toString();
    }

    public static void testPrintArrayToString(Scanner input) {
        int[] emptyArr = new int[0];
        int[] oneElementArr = {(int) (Math.random() * 10)};
        int[] nElementsArr = generateArray(input);;
        System.out.printf("Print empty array: %s\n", arrayToString(emptyArr));
        System.out.printf("Print one-element array: %s\n", arrayToString(oneElementArr));
        System.out.printf("Print n-element array: %s\n", arrayToString(nElementsArr));
        System.out.println();
    }

    // 3.5
    public static boolean contains(int[] array, int key) {
        boolean hasKey = false;
        for (int item: array) {
            if (item == key) {
                hasKey = true;
                break;
            }
        }
        return hasKey;
    }

    public static void testContains(Scanner input) {
        int key = (int) (Math.random() * 10);
        System.out.printf("Key is: %d\n", key);
        int[] array = generateArray(input);
        System.out.print("Array is: ");
        print(array);
        System.out.println();
        if (contains(array, key)) {
            System.out.println("Array contains key " + key);
        } else {
            System.out.println("Array not contains key " + key);
        }
    }

    // 3.6
    public static int search(int[] array, int key) {
        int indexOfKey = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                indexOfKey = i;
                break;
            }
        }
        return indexOfKey;
    }

    public static void testSearch(Scanner input) {
        int key = (int) (Math.random() * 10);
        System.out.println("Key is: " + key);
        int[] array = generateArray(input);
        print(array);
        System.out.println();
        System.out.println("Index of key in array is (-1 means array has not contain key): " + search(array, key));
    }

    // 3.7
    public static boolean checkEquals(int[] array1, int[] array2) {
        boolean isEquals = true;
        if (array1.length != array2.length) {
            isEquals = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    isEquals = false;
                    break;
                }
            }
        }
        return isEquals;
    }

    public static void testEquals(Scanner input) {
        int[] array1 = generateArray(input);
        System.out.print("array1: ");
        print(array1);
        System.out.println();
        int[] array2 = generateArray(input);
        System.out.print("array2: ");
        print(array2);
        System.out.println();

        System.out.println("Check two array equals");
        if (checkEquals(array1, array1)) {
            System.out.println("Two array is equals");
        }

        System.out.println("Check two random array");
        if (checkEquals(array1, array2)) {
            System.out.println("Two array is equals");
        } else {
            System.out.println("Two array is not equals");
        }
    }

    // 3.8
    public static int[] copyOf(int[] array) {
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < copyOfArray.length; i++) {
            copyOfArray[i] = array[i];
        }
        return copyOfArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copyOfArray = new int[newLength];
        for (int i = 0; i < copyOfArray.length; i++) {
            copyOfArray[i] = array[i];
        }
        return copyOfArray;
    }

    public static void testCopyOf(Scanner input) {
        int[] array = generateArray(input);
        System.out.println("Array: " + arrayToString(array));
        int[] copyOfArray = copyOf(array);
        System.out.println("Copy of array: " + arrayToString(copyOfArray));
        int newLength = (int) (Math.random() * array.length);
        System.out.println("New length is: " + newLength);
        int[] copyOfArrWithNewLength = copyOf(array, newLength);
        System.out.println("Copy of array with new length: " + arrayToString(copyOfArrWithNewLength));
    }

    // 3.9
    public static boolean swap(int[] array1, int[] array2) {
        boolean isSwap = false;
        int temp;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            isSwap = true;
        }
        return isSwap;
    }

    public static void testSwap(Scanner input) {
        int[] array1 = generateArray(input);
        System.out.println("Array 1: " + arrayToString(array1));
        int[] array2 = generateArray(input);
        System.out.println("Array 2: " + arrayToString(array2));

        if (swap(array1, array2)) {
            System.out.println("Two array has swapped");
            System.out.println("Array 1 now is: " + arrayToString(array1));
            System.out.println("Array 2 now is: " + arrayToString(array2));
        } else {
            System.out.println("Wrap failed: because two arrays are not the same length");
        }
    }

    // 3.10
    public static void reverse(int[] array) {
        int[] copyOfArray = copyOf(array);
        int temp;
        for (int fIdx = 0, lIdx = array.length - 1; fIdx < lIdx; ++fIdx, --lIdx) {
            temp = array[fIdx];
            array[fIdx] = array[lIdx];
            array[lIdx] = temp;
        }
    }

    public static void testReverse(Scanner input) {
        int[] array = generateArray(input);
        System.out.println("Array before reverse: " + arrayToString(array));
        reverse(array);
        System.out.println("Array after reverse: " + arrayToString(array));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ex3.1: ");
        testExponent(input);
        System.out.println("Ex3.2: ");
        testMagicSum(input);
        System.out.println("Ex3.3: ");
        testPrintArray(input);
        System.out.println("Ex3.4: ");
        testPrintArrayToString(input);
        System.out.println("Ex3.5: ");
        testContains(input);
        System.out.println("Ex3.6: ");
        testSearch(input);
        System.out.println("Ex3.7: ");
        testEquals(input);
        System.out.println("Ex3.8: ");
        testCopyOf(input);
        System.out.println("Ex3.9: ");
        testSwap(input);
        System.out.println("Ex3.10: ");
        testReverse(input);
    }
}
