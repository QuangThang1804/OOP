package shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Circle("red", false, 5.5);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        // System.out.println(shape1.getRadius());
        // it's has error because superclass Shape doesn't have method getRadius()
        // fix
        if (shape1 instanceof Circle) {
            System.out.println(((Circle) shape1).getRadius());
        }

        if (shape1 instanceof Circle) {
            Circle circle1 = (Circle) shape1;
            System.out.println(circle1);
            System.out.println(circle1.getArea());
            System.out.println(circle1.getPerimeter());
            System.out.println(circle1.getColor());
            System.out.println(circle1.getRadius());
        }

//        Shape shape2 = new Shape();
        // error because abstract class don't allow to generate an instructor

        Shape shape3 = new Rectangle("red", false, 1.0, 2.0);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
//        System.out.println(shape3.getLength());
        // error because Shape doesn't have method getLength()
        // fix
        if (shape3 instanceof Rectangle) {
            System.out.println(((Rectangle) shape3).getLength());
        }

        Rectangle rectangle1 = (Rectangle) shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
//        System.out.println(shape4.getSide());
        // error because Shape doesn't have method getSide()
        // fix
        if (shape4 instanceof Square) {
            System.out.println(((Square) shape4).getSide());
        }

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        System.out.println(rectangle2.getLength());
        // System.out.println(rectangle2.getSide());
        // error because Rectangle doesn't have method getSide()
        // fix
        if (rectangle2 instanceof Square) {
            System.out.println(((Square) rectangle2).getSide());
        }

        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());
    }

//    Question: What is the usage of the abstract method and abstract class?
//    Answer:
//    Abstract Method:
//    - An abstract method is a method declared without an implementation (body).
//    It only has a signature specifying the return type and parameters.
//    - The purpose is to outline a specific functionality that must be implemented by subclasses
//    that inherit from the abstract class.
//    - Abstract methods cannot be used directly and are essentially forcing subclasses to
//    provide their own version of the functionality.
//
//    Abstract Class:
//    - An abstract class is a class that is declared with the abstract keyword.
//    It can contain a mix of abstract and regular methods.
//    - The key aspect is that abstract classes cannot be directly instantiated
//    (It mean that we can't create objects of them).

}
