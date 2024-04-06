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
//
//    Question: What is the difference between an interface and an abstract class?
//    Answer:
//
//    Interface:
//    - An interface defines a contract - a set of method signatures that a class must implement.
//    - Interfaces only have abstract methods.
//    - A class can implement multiple interfaces, inheriting the methods from each.
//    - Interfaces focus purely on functionality, specifying what a class can do, not how it does it.
//
//    Abstract Class:
//    - An abstract class serves as a blueprint for subclasses.
//    It can contain both abstract and non-abstract methods.
//    - Abstract classes cannot be directly instantiated,
//    it means that we can't create objects of them.
//    - Subclasses inherit the abstract class's methods and fields,
//    and can implement for the abstract methods.
}
