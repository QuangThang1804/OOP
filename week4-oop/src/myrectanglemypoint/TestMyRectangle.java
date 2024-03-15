package myrectanglemypoint;

import mypoint.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(0, 4, 6, 0);
        System.out.println(rectangle1);

        MyPoint topLeft = new MyPoint(0, 5);
        MyPoint bottomRight = new MyPoint(3, 0);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle2);

        rectangle1.setTopLeftXY(5, 10);
        rectangle1.setBottomRightXY(2, 8);
        System.out.println(rectangle1);

        System.out.println("topLeft x is: " + rectangle1.getTopLeftX());
        System.out.println("topLeft y is: " + rectangle1.getTopLeftY());
        System.out.println("topLeft is " + rectangle1.getTopLeft());
        System.out.println("bottomRight x is: " + rectangle1.getBottomRightX());
        System.out.println("bottomRight y is: " + rectangle1.getBottomRightY());
        System.out.println("bottomRight is " + rectangle1.getBottomRight());

        System.out.println("width of rectangle1 is: " + rectangle1.getWith());
        System.out.println("height of rectangle1 is: " + rectangle1.getHeight());
        System.out.println("area of rectangle1 is: " + rectangle1.getArea());
        System.out.println("perimeter of rectangle1 is: " + rectangle1.getPerimeter());
    }
}
