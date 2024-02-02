// 3.5
public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15432;
        extractDigits(n);
    }

    public static void extractDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}
