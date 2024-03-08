package rectangle;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle2.toString());

        rectangle1.setLength(3.0f);
        rectangle1.setWidth(2.0f);
        System.out.println(rectangle1.toString());
        System.out.println("Now length of rectangle1 is: " + rectangle1.getLength());
        System.out.println("Now width of rectangle1 is " + rectangle1.getWidth());

        System.out.printf("Area of rectangle1 is: %.2f\n", rectangle1.getArea());
        System.out.printf("Perimeter of rectangle1 is: %.2f\n", rectangle1.getPerimeter());
    }
}
