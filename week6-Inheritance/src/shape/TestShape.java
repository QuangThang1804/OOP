package shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);
        shape2.setColor("brown");
        shape2.setFilled(true);
        System.out.println("color is: " + shape2.getColor());
        if (shape2.isFilled()) {
            System.out.println("shape is filled");
        } else {
            System.out.println("shape is not filled");
        }
        System.out.println(shape2);
    }
}
