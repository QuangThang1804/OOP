package hus.oop.lap10.adapterpseudocode;

public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
