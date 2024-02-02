// 3.4
public class Fibonacci {
    public static void main(String[] args) {
        int number = 20;
        int [] fibonacciArr = fibonacci(number);
        System.out.println("The first " + number + " Fibonacci numbers are: ");
        printArr(fibonacciArr);

        System.out.println();

        int [] tribonacciArr = Tribonacci(number);
        System.out.println("The first " + number + " Tribonacci numbers are: ");
        printArr(tribonacciArr);
    }

    public static int [] fibonacci(int number) {
        int [] fibArr = new int[number];
        for (int i = 0; i < fibArr.length; i++) {
            if (i >= 2) {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
            } else if (i == 1) {
                fibArr[i] = 1;
            } else if (i == 0) {
                fibArr[i] = 1;
            }
        }
        return fibArr;
    }

    public static int[] Tribonacci(int number) {
        int [] triArr = new int[number];
        for (int i = 0; i < triArr.length; i++) {
            if (i >= 3) {
                triArr[i] = triArr[i - 3] + triArr[i - 2] + triArr[i - 1];
            } else if (i == 1) {
                triArr[i] = 1;
            } else if (i == 0) {
                triArr[i] = 1;
            } else if (i == 2){
                triArr[i] = 2;
            }
        }
        return triArr;
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + " ");
            } else
                System.out.print(array[i]);
        }
    }
}
