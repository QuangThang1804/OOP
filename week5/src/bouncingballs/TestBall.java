package bouncingballs;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(50, 50, 5, 10, 30);
        System.out.println(ball1);

        ball1.setX(10);
        ball1.setY(10);
        ball1.setRadius(8);
        ball1.setXDelta(20);
        ball1.setYDelta(15);
        System.out.println("x is: " + ball1.getX());
        System.out.println("y is: " + ball1.getY());
        System.out.println("xDelta is: " + ball1.getXDelta());
        System.out.println("yDelta is: " + ball1.getYDelta());
        System.out.println(ball1);

        ball1.move();
        ball1.reflectHorizontal();
        ball1.reflectVertical();
        System.out.println(ball1);
    }
}
