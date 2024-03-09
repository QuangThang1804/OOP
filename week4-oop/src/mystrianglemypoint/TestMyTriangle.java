package mystrianglemypoint;

import mypoint.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint();
        MyPoint v2 = new MyPoint(3, 5);
        MyPoint v3 = new MyPoint(2, 8);
        MyTriangle myTriangle1 = new MyTriangle(1, 3, 2, 4, 5, 10);
        System.out.println(myTriangle1);
        MyTriangle myTriangle2 = new MyTriangle(v1, v2, v3);
        System.out.println(myTriangle2);

        System.out.printf("perimeter of triangle1 is: %.2f\n", myTriangle1.getPerimeter());
        System.out.println("type of triangle1 is: " + myTriangle1.getType());
        System.out.println("type of triangle2 is: " + myTriangle2.getType());
    }
}
