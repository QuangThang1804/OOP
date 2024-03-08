import java.util.Scanner;

public class SortingAndSearching {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = (int) (Math.random() * 20);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            System.out.print(array[idx] + " ");
        }
        System.out.println();
    }
    // 2.1
    public static boolean linearSearch(int[] array, int key) {
        boolean containsKey = false;
        for (int num: array) {
            if (num == key) {
                containsKey = true;
                break;
            }
        }
        return containsKey;
    }

    public static int linearSearchIndex(int[] array, int key) {
        int keyIndex = -1;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                keyIndex = idx;
                break;
            }
        }
        return keyIndex;
    }

    public static void testLinearSearch() {
        int[] array = generateArray(10);
        printArray(array);
        int key = (int) (Math.random() * 20);
        System.out.println("Key is " + key);
        if (linearSearch(array, key)) {
            System.out.println("Index of key in array is: " + linearSearchIndex(array, key));;
        } else {
            System.out.println("Key is not in array");
        }
    }

    // 2.2
    public static void sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static boolean binarySearch(int[] sortArr, int key, int fromIdx, int toIdx) {
        int middleIdx;
        while (fromIdx != toIdx - 1) {
            middleIdx = (fromIdx + toIdx) / 2;
            if (key == sortArr[middleIdx]) {
                return true;
            } else if (key < sortArr[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
            binarySearch(sortArr, key, fromIdx, toIdx);
        }
        return key == sortArr[fromIdx];
    }

    public static void testBinarySearch() {
        int[] array = generateArray(10);
        System.out.println("Array before sort");
        printArray(array);
        System.out.println("Array after sort");
        sortArray(array);
        printArray(array);
        int key = (int) (Math.random() * 20);
        System.out.println("Key is " + key);
        if (binarySearch(array, key, 0, array.length)) {
            System.out.println("Key is found in array");
        } else {
            System.out.println("Key is not found in array");
        }
    }

    // 2.3
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        int temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        printArray(array);
    }

    public static void testBubbleSort() {
        int[] array = generateArray(5);
        System.out.println("Array before sort");
        printArray(array);
        System.out.println("Array after sort");
        bubbleSort(array);
    }

    // 2.4
    public static void selectionSort(int[] array) {
        int temp;
        int minIdx;
        for (int i = 0; i < array.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
        printArray(array);
    }

    public static void testSelectionSort() {
        int[] array = generateArray(5);
        System.out.println("Array before sort");
        printArray(array);
        System.out.println("Array after sort");
        selectionSort(array);
    }

    // 2.5
    public static void insertionSort(int[] array) {
        int key;
        for (int idx = 1; idx < array.length; idx++) {
            key = array[idx];
            int j = idx - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        printArray(array);
    }

    public static void testInsertionSort() {
        int[] array = generateArray(5);
        System.out.println("Array before sort:");
        printArray(array);
        System.out.println("Array after sort:");
        insertionSort(array);
    }
    public static void main(String[] args) {
        testLinearSearch();
        testBinarySearch();
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
    }
}
