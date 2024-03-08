package anothercircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println(circle1);

        Circle circle2 = new Circle(1.1);
        System.out.println(circle2);

        Circle circle3 = new Circle(2.2);
        System.out.println(circle3);

        System.out.println("Radius of circle1 is: " + circle1.getRadius());
        System.out.printf("Area of circle1 is: %.2f\n", circle1.getArea());
        System.out.printf("Circumference of circle1 is: %.2f\n", circle1.getCircumference());
    }
}
