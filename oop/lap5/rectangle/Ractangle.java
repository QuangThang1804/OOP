package hus.oop.lap5.rectangle;

public class Ractangle {
    private float length;
    private float width;

    public Ractangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Ractangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return (width * length);
    }

    public double getPerimeter() {
        return (2 * (width + length));
    }

    @Override
    public String toString() {
        return "Ractangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
