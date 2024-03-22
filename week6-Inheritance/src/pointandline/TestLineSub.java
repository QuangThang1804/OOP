package pointandline;

public class TestLineSub {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(5, 6);
        Point p2 = new Point(1, 3);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        l2.setBegin(new Point(1, 10));
        l2.setEnd(new Point(5, 8));
        System.out.println(l2.getBegin());
        System.out.println(l2.getEnd());

        l2.setBeginX(0);
        l2.setBeginY(3);
        l2.setEndX(5);
        l2.setEndY(2);
        System.out.println("x begin is: " + l2.getBeginX());
        System.out.println("y begin is: " + l2.getBeginY());
        System.out.println("x end is: " + l2.getEndX());
        System.out.println("y end is: " + l2.getEndY());

        l2.setBeginXY(2, 10);
        l2.setEndXY(4, 8);
        System.out.println(l2);
    }
}
