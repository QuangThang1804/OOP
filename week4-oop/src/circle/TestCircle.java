package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(1.1);
        System.out.println(circle2.toString());

        Circle circle3 = new Circle(3.3, "blue");
        System.out.println(circle3.toString());
        System.out.printf("Area of circle3 is: %.2f\n", circle1.getArea());
        System.out.println("Set radius of circle3 to 5");
        circle3.setRadius(5);
        System.out.println("Now radius of circle3 is " + circle1.getRadius());
        System.out.println(circle1.toString());
    }
}
