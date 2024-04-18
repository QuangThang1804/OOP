import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Thêm các phần tử vào Stack
        stack.push("10");
        stack.push("20");
        stack.push("30");

        // Hiển thị các phần tử trong Stack
        System.out.println("Stack: " + stack);

        // Lấy phần tử trên cùng và xóa nó khỏi Stack
        String topElement = stack.pop();
        System.out.println("Phần tử được lấy ra: " + topElement);

        // Hiển thị các phần tử còn lại trong Stack
        System.out.println("Stack sau khi pop: " + stack);
    }

    public static double[] sortHEHE(double[] array, boolean isIncreasing) {
        double[] sortArr = new double[array.length];
        System.arraycopy(array, 0, sortArr, 0, array.length);
        double temp;
        int minIdx;
        int maxIdx;
        int k = 0;
        if (isIncreasing) {
            for (int i = 0; i < sortArr.length - 1; i++) {
                minIdx = i;
                for (int j = i + 1; j < sortArr.length; j++) {
                    if (sortArr[minIdx] > sortArr[j]) {
                        minIdx = j;
                    }
                }
                temp = sortArr[i];
                sortArr[i] = sortArr[minIdx];
                sortArr[minIdx] = temp;
            }
        } else {
            for (int i = 0; i < sortArr.length - 1; i++) {
                maxIdx = i;
                for (int j = i + 1; j < sortArr.length; j++) {
                    if (sortArr[maxIdx] < sortArr[j]) {
                        maxIdx = j;
                    }
                }
                temp = sortArr[i];
                sortArr[i] = sortArr[maxIdx];
                sortArr[maxIdx] = temp;
            }
        }
        return sortArr;
    }
}