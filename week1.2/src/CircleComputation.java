import java.text.DecimalFormat;
import java.util.Scanner;

// 4.2
public class CircleComputation {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();

        System.out.println("diameter = " + df.format(computeDiameter(radius)));

        System.out.println("area = " + df.format(computeArea(radius)));

        System.out.println("circumference = " + df.format(computeCircumference(radius)));

        System.out.println("surfaceArea = " + df.format(computeSurfaceArea(radius)));
        System.out.println("volume = " + df.format(computeVolume(radius)));
    }

    public static double computeDiameter(double radius) {
        return radius * 2;
    }

    public static double computeArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double computeCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double computeSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double computeVolume(double radius) {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
