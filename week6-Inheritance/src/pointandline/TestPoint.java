package pointandline;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);

        point.setXY(5, 6);
        System.out.println(point);

        point.setX(0);
        point.setY(5);
        System.out.println("x is: " + point.getX());
        System.out.println("y is: " + point.getY());
        System.out.println(point);
    }
}
