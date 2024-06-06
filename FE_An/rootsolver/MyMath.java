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

//    public static double sin(double x) {
//        double result = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 4 == 1) {
//                result += Math.pow(x, i) / calculateFactorial(i);
//            } else if (i % 4 == 3) {
//                result -= Math.pow(x, i) / calculateFactorial(i);
//            }
//        }
//        return result;
////        double accuracy = 0.0001, denominator, sinx, sinval;
////        double x1 = x;
////        sinx = x;
////        sinval = sinx;
////        int i = 1;
////        do {
////            denominator = 2 * i * (2 * i + 1);
////            x1 = -x1 * x * x / denominator;
////            sinx = sinx + x1;
////            i = i + 1;
////        } while (accuracy <= sinval - sinx);
////        return sinx;
//
//    }
//
//    public static double cos(double x) {
//        double result = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 4 == 0) {
//                result += Math.pow(x, i) / calculateFactorial(i);
//            } else if (i % 4 == 2) {
//                result -= Math.pow(x, i) / calculateFactorial(i);
//            }
//        }
//        return result;
//    }
//
//    public static double exp(double x) {
//        double result = 0;
//        for (int i = 0; i < 20; i++) {
//            result += Math.pow(x, i) / calculateFactorial(i);
//        }
//        return result;
//    }
//
//    public static double ln(double x) {
//        double result = 0.0;
//        double term = x;
//
//        for (int i = 1; i <= 200; i++) {
//            result += term / i;
//            term *= -x;
//        }
//
//        return result;
//    }
    public static double sin(double x) {
        double denominator, sinX;
        double term = x;
        sinX = x;
        int i = 1;
        do {
            denominator = (i * 2) * (i * 2 + 1);
            term *= -(x * x) / denominator;
            sinX += term;
            i++;
        } while (Math.abs(term) >= 1e-10);
        return sinX;

    }

    public static double cos(double x) {
        double term, denominator, cosX;
        term = 1;
        cosX = 1;
        int i = 1;
        do {
            denominator = 2 * i * (2 * i - 1);
            term *= -(x * x) / denominator;
            cosX += term;
            i++;

        } while (Math.abs(term) >= 1e-10);
        return cosX;
    }

    public static double exp(double x) {
        double term, expSum;
        int i = 1;
        expSum = 1;
        term = 1;
        do {
            term *= x / i;
            expSum += term;
            i++;
        } while (Math.abs(term) >= 1e-10);
        return expSum;
    }

    public static double ln(double x) {
        double term, lnSum;
        int i = 2;
        lnSum = x;
        term = x;
        do {
            term *= -x;
            lnSum += term / i;
            i++;
        } while (Math.abs(term) >= 1e-10);
        return lnSum;
    }
}
