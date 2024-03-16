package ballandplayer;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.1f, 2.2f, 3.3f);
        System.out.println(ball);

        ball.setXYZ(0.0f, 1.1f, 2.2f);
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("z is: " + ball.getZ());
        System.out.println(ball);
    }
}
