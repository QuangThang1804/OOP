package hus.oop.lap10.strategy;

public class SelectionSort implements Sorter {
    @Override
    public void sort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (data[j] < data[min_idx])
                    min_idx = j;

            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }
}
