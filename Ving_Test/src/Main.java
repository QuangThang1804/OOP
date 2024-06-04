import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 10, 50, 0, 5};
        arr = maximizeDifferenceAndLexicographicallyLargest(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] array, boolean decreasing) {
        int n = array.length;
        boolean swapped;
        int temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (decreasing) {
                    if (array[i - 1] < array[i]) {
                        temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                        swapped = true;
                    }
                } else {
                    if (array[i - 1] > array[i]) {
                        temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                        swapped = true;
                    }
                }
            }
            n = n - 1;
        } while (swapped);
        return array;
    }

    private static int[] maximizeDifferenceAndLexicographicallyLargest(int[] arr) {
        arr = bubbleSort(arr, true);
        int[] newArr = new int[arr.length - 2];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        newArr = bubbleSort(newArr, false);

        for (int i = 0; i < newArr.length; i++) {
            arr[i + 1] = newArr[i];
        }
        return arr;
    }
}