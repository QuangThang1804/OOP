package strategypattern.sort;

public class InsertionSort implements SortAlgorithms {
    @Override
    public void sort(int[] array) {
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
    }
}
