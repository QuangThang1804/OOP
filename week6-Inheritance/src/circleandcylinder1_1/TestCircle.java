package circleandcylinder1_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(5);
        System.out.println(circle1);

        Circle circle2 = new Circle(3, "blue");
        System.out.println(circle2);

        circle2.setRadius(10);
        circle2.setColor("pink");
        System.out.println("color is: " + circle2.getColor());
        System.out.println("radius is: " + circle2.getRadius());
        System.out.println("area is: " + circle2.getArea());
    }
}
