package movable1_8;

public class TestMain {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(2, 10, 7, 15, 5, 5);
        System.out.println(movableRectangle);

        movableRectangle.moveUp();
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        System.out.println(movableRectangle);
        movableRectangle.moveLeft();
        System.out.println(movableRectangle);
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
