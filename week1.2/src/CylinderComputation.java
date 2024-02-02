import java.text.DecimalFormat;
import java.util.Scanner;

// 4.2.2
public class CylinderComputation {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();

        System.out.print("Enter the height: ");
        double height = in.nextDouble();

        System.out.println("baseArea = " + df.format(computeBaseArea(radius)));
        System.out.println("surfaceArea = " + df.format(computeSurfaceArea(radius)));
        System.out.println("volume = " + df.format(computeVolume(radius, height)));
    }

    public static double computeBaseArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double computeSurfaceArea(double radius) {
        return 2 * Math.PI * radius + 2 * computeBaseArea(radius);
    }

    public static double computeVolume(double radius, double height) {
        return computeBaseArea(radius) * height;
    }
}
