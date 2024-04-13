public class Main {
    public static void main(String[] args) {
        int[] coeffs = {0, 0, 5, 0, 6, 1, 0};
        int degree = -1;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                degree = i;
                break;
            }
        }
        System.out.println(degree);
    }
}