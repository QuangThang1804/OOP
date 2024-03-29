package movableandmovablepoint;

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
    }
}
