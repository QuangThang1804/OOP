package hus.FE_An.rootsolver;

public class MyMath {
    public static double calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        double result = 1;
        for (int i = number; i >= 2; i--) {
            result *= i;
        }
        return result;
    }

    public static double sin(double x) {
        double result = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 1) {
                result += Math.pow(x, i) / calculateFactorial(i);
            } else if (i % 4 == 3) {
                result -= Math.pow(x, i) / calculateFactorial(i);
            }
        }
        return result;
    }

    public static double cos(double x) {
        double result = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                result += Math.pow(x, i) / calculateFactorial(i);
            } else if (i % 4 == 2) {
                result -= Math.pow(x, i) / calculateFactorial(i);
            }
        }
        return result;
    }

    public double exp(double x) {
        double result = 0;
        for (int i = 0; i < 20; i++) {
            result += Math.pow(x, i) / calculateFactorial(i);
        }
        return result;
    }

    public double ln(double x) {
        double result = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 1) {
                result += Math.pow(x, i) / i;
            } else {
                result -= Math.pow(x, i) / i;
            }
        }
        return result;
    }
}
