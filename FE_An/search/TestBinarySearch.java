package hus.FE_An.search;

import java.util.Random;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật toán tìm kiếm nhị phân với
          mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */
        Random rand = new Random();
        int ranNum = rand.nextInt(10) + 21;
        double[] arr = new double[ranNum];
        for (int i = 0; i < ranNum; i++) {
            arr[i] = rand.nextInt(50);
        }

        BinarySearch binarySearch = BinarySearch.getInstance();
        double[] copyOfArr = new double[ranNum];
        double ranDoubleNum;
        ranDoubleNum = rand.nextInt(50);
        String[] nameSort = {"Bubble Sort", "Selection Sort", "Insertion Sort"};
        for (int i = 0; i < nameSort.length; i++) {
            System.arraycopy(arr, 0, copyOfArr, 0, arr.length);
            if (i == 0) {
                binarySearch.setSorter(new BubbleSort());
            } else if (i == 1) {
                binarySearch.setSorter(new SelectionSort());
            } else {
                binarySearch.setSorter(new InsertionSort());
            }
//            ranDoubleNum = rand.nextInt(50);
//            System.out.println("Value:" + ranDoubleNum);
            Sorter sorter = new BubbleSort();
            binarySearch.setSorter(new BubbleSort());
            System.out.printf("Using %s Algorithm\n", nameSort[i]);
            System.out.println("Before sorting: " + printArr(copyOfArr));
            sorter.sort(copyOfArr, true);
            System.out.println("After sorting: " + printArr(copyOfArr));
            System.out.printf("Binary search gia tri %s: %d \n"
                    , ranDoubleNum, binarySearch.search(copyOfArr, ranDoubleNum));
        }

    }

    public static String printArr(double[] arr) {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str.append(arr[i]).append(" ");
            } else {
                str.append(arr[i]).append("]");
            }
        }
        return str.toString();
    }
}
