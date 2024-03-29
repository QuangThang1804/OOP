package shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setLength(double side) {
        this.setSide(side);
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" +
                super.toString() +
                ", width=" + this.getSide() +
                ", length= " + this.getSide() +
                "]";
    }
}
