package hus.oop.lap10.adapterpseudocode;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square(5);
        Shape shape = new SquareAdapter(square);
        double area = shape.getArea();
        System.out.println("Area: " + area);
    }
}