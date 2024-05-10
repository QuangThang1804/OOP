package decorator.shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        this.shape.draw();
        this.setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("set red border for the shape");
    }
}
