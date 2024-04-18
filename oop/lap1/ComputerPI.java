package hus.oop.lab1;

public class ComputerPI {
    public static void main(String[] args) {
        double sum = 0;
        int MAX_DENOMINATOR = 1000;
        double temp = 1;
        for (int i = 1; i <= MAX_DENOMINATOR; i += 2) {
            sum += temp / i;
            temp *= -1;
        }
        System.out.printf("%.3f\n", (4 * sum));
    }
}
