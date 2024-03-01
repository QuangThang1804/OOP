//3.4
public class GCD {
    public static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void testGCD() {
        int number1 = (int) (Math.random() * 100);
        System.out.println("Number 1 is " + number1);
        int number2 = (int) (Math.random() * 100);
        System.out.println("Number 2 is " + number2);
        System.out.printf("GCD of %d and %d is %d", number1, number2, gcd(number1, number2));
    }
    public static void main(String[] args) {
        testGCD();
    }
}
