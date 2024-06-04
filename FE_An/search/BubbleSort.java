package hus.FE_An.search;

public class BubbleSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Bubble sort.
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        if (order) {
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        int n = data.length;
        boolean swapped;
        double temp;
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
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        int n = data.length;
        boolean swapped;
        double temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (data[i - 1] < data[i]) {
                    temp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
    }
}
