package strategypattern.sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {5, 4, 2, 6, 1};
        Array arrObject = new Array(array);
        String chooseAlgorithms = input.nextLine();
        if (chooseAlgorithms.equals("bubble")) {
            arrObject.setSortAlgorithms(new BubbleSort());
        }
        if (chooseAlgorithms.equals("selection")) {
            arrObject.setSortAlgorithms(new SelectionSort());
        }
        if (chooseAlgorithms.equals("insertion")) {
            arrObject.setSortAlgorithms(new InsertionSort());
        }

        arrObject.sort();
        printArr(arrObject.getArray());
    }

    public static void printArr(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int num: arr) {
            str.append(num).append(" ");
        }
        System.out.println(str.toString());
    }
}
