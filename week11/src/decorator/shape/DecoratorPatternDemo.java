package decorator.shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle has border which not be colored");
        circle.draw();

        System.out.println("Circle has red border");
        redCircle.draw();

        System.out.println("Rectangle has red border");
        redRectangle.draw();
    }
}
