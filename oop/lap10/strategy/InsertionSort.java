package hus.oop.lap10.strategy;

public class InsertionSort implements Sorter {
    public void sort(int[] data) {
        int n = data.length;
        for (int i = 1; i < n; i++) {
            int key = data[i];
            int j = i - 1;

            //Di chuyển các phân tử của arr [0 ... i-1] lớn hơn key
            //Đến một vị trí trước vị trí hiện taị của chúng
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + i] = key;
        }
    }
}
