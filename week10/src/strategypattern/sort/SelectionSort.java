package strategypattern.sort;

public class SelectionSort implements SortAlgorithms {
    @Override
    public void sort(int[] array) {
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
    }
}
