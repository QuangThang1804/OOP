package decorator.shape;

public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    public ShapeDecorator(Shape decoratedShape) {
        this.shape = decoratedShape;
    }
    @Override
    public void draw() {
        this.shape.draw();
    }
}
