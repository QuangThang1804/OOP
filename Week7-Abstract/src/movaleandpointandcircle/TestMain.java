package movaleandpointandcircle;

import movableandmovablepoint.MovablePoint;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(2, 10, 5, 5);
        System.out.println(point1);
        point1.moveUp();
        System.out.println(point1);
        point1.moveDown();
        System.out.println(point1);
        point1.moveLeft();
        System.out.println(point1);
        point1.moveRight();
        System.out.println(point1);

        MovableCircle circle = new MovableCircle(2, 10, 5, 5, 3);
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
    }
}
