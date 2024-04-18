package hus.oop.lap10.adapterpseudocode;

public class SquareAdapter implements Shape{
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    public double getArea() {
        return square.calculateArea();
    }
}
