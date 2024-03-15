package myrectanglemypoint;

import mypoint.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    public int[] getTopLeftXY() {
        int[] arr = new int[2];
        arr[0] = topLeft.getX();
        arr[1] = topLeft.getY();
        return arr;
    }

    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    public int[] getBottomRightXY() {
        int[] arr = new int[2];
        arr[0] = bottomRight.getX();
        arr[1] = bottomRight.getY();
        return arr;
    }

    public void setBottomRightXY(int x, int y) {
        bottomRight.setXY(x, y);
    }

    @Override
    public String toString() {
        return "myrectanglemypoint.MyRectangle[" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ']';
    }

    public int getWith() {
        int left = Math.min(topLeft.getX(), bottomRight.getX());
        int right = Math.max(topLeft.getX(), bottomRight.getX());
        return right - left;
    }

    public int getHeight() {
        int top = Math.max(topLeft.getY(), bottomRight.getY());
        int bottom = Math.min(topLeft.getY(), bottomRight.getY());
        return top - bottom;
    }

    public int getArea() {
        return getWith() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getHeight() + getWith());
    }
}
