package sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        boolean swapped;
        int temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (data[i - 1] > data[i]) {
                    temp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        return data;
    }
}
