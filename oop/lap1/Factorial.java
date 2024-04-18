package hus.oop.lab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        try {
            long result = factorial(n);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static long factorial(int n) throws Exception {
        if (n < 0)
            throw new Exception("n > 0");
        else if (n == 1)
            return 1;
        else if (n == 0)
            return 1;
        else {
            long n1 = factorial(n - 1);
            return n * n1;
        }
    }
}
