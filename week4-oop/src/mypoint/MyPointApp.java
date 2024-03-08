package mypoint;

public class MyPointApp {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
            System.out.println(points[i].toString());
        }
    }
}
