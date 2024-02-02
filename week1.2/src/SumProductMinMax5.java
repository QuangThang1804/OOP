import java.util.Scanner;

// 4.1.1
public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        int number1st = input.nextInt();

        System.out.print("Enter the 2nd integer: ");
        int number2nd = input.nextInt();

        System.out.print("Enter the 3rd integer: ");
        int number3rd = input.nextInt();

        System.out.print("Enter the 4th integer: ");
        int number4th = input.nextInt();

        System.out.print("Enter the 5th integer: ");
        int number5th = input.nextInt();

        System.out.println("The sum is " + computeSum(number1st, number2nd, number3rd, number4th, number5th));
        System.out.println("The product is " + computeProduct(number1st, number2nd, number3rd, number4th, number5th));
        System.out.println("The min is " + findMin(number1st, number2nd, number3rd, number4th, number5th));
        System.out.println("The max is " + findMax(number1st, number2nd, number3rd, number4th, number5th));
    }

    public static int computeSum(int number1, int number2, int number3, int number4, int number5) {
        return number1 + number2 + number3 + number4 + number5;
    }

    public static int computeProduct(int number1, int number2, int number3, int number4, int number5) {
        return number1 * number2 * number3 * number4 * number5;
    }

    public static int [] sortArr(int number1, int number2, int number3, int number4, int number5) {
        int[] arr = {number1, number2, number3, number4, number5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++)
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static int findMin(int number1, int number2, int number3, int number4, int number5) {
        return sortArr(number1, number2, number3, number4, number5)[0];
    }

    public static int findMax(int number1, int number2, int number3, int number4, int number5) {
        return sortArr(number1, number2, number3, number4, number5)[4];
    }
}
