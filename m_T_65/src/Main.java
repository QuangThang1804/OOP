import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] coefficients = {5, 0, 1, 0, 0};
        int degree = -1;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] != 0) {
                degree = i;
                break;
            }
        }
        System.out.println(degree);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(null);
        list.add(7);
        System.out.println(list.toString());
    }
}