// 2.2
public class CheckOddEven {
    public static void main(String[] args) {
        int [] number = {0, 1, 88, 99, -1, -2};
        checkOddEven(number);
        System.out.println("Bye!");
    }

    public static void checkOddEven(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("The number is " + number[i]);
            if (number[i] % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        }
    }
}
