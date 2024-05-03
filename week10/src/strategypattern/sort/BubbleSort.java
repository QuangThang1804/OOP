package strategypattern.sort;

public class BubbleSort implements SortAlgorithms {
    @Override
    public void sort(int[] array) {
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
    }
}
