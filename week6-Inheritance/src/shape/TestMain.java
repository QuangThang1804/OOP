package shape;

public class TestMain {
    public static void main(String[] args) {
        // Test circle
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle("blue", true, 5);
        System.out.println(circle2);

        circle2.setColor("green");
        circle2.setFilled(false);
        circle2.setRadius(10);
        System.out.println("color is: " + circle2.getColor());
        if (circle2.isFilled()) {
            System.out.println("circle is filled");
        } else {
            System.out.println("circle is not filled");
        }
        System.out.println("radius is: " + circle2.getRadius());
        System.out.println("area is: " + circle2.getArea());
        System.out.println("perimeter is: " + circle2.getPerimeter());

        // Test Rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(5, 3);
        System.out.println(rectangle2);

        rectangle2.setLength(10);
        rectangle2.setWidth(5);
        System.out.println("length is: " + rectangle2.getLength());
        System.out.println("width is: " + rectangle2.getWidth());
        System.out.println("area is: " + rectangle2.getArea());
        System.out.println("perimeter is: " + rectangle2.getPerimeter());

        // Test Square
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(4);
        System.out.println(square2);

        square2.setSide(6);
        System.out.println("side is: " + square2.getSide());
        System.out.println("area is: " + square2.getArea());
        square2.setLength(4);
        System.out.println(square2);
        square2.setWidth(8);
        System.out.println(square2);
    }
}
