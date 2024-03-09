package mylinemypoint;

import mypoint.MyPoint;

import java.sql.SQLOutput;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(2, 0);
        MyPoint end = new MyPoint(5, 0);

        MyLine myLine1 = new MyLine(begin, end);
        System.out.println(myLine1);
        MyLine myLine2 = new MyLine(3, 0, 1, 0);
        System.out.println(myLine2);

        System.out.println("beginX is: " + myLine1.getBeginX());
        System.out.println("beginY is: " + myLine1.getBeginY());
        System.out.println("endX is: " + myLine1.getEndX());
        System.out.println("endY is: " + myLine1.getEndY());
        System.out.println("begin point is: " + myLine1.getBegin());
        System.out.println("end point is: " + myLine1.getEnd());
        System.out.println(myLine1.getBeginXY()[0]);
        System.out.println(myLine1.getBeginXY()[1]);
        System.out.println(myLine1.getEndXY()[0]);
        System.out.println(myLine1.getEndXY()[1]);

        myLine1.setBegin(new MyPoint(1, 6));
        myLine1.setEnd(new MyPoint(2, 5));
        System.out.println(myLine1);

        myLine1.setBeginX(3);
        myLine1.setBeginY(5);
        myLine1.setEndX(2);
        myLine1.setEndY(0);
        System.out.println(myLine1);

        myLine1.setBeginXY(3, 10);
        myLine1.setEndXY(6, 9);
        System.out.println(myLine1);

        System.out.println("length of line is: " + myLine1.getLength());
        System.out.println("gradient of line is: " + myLine1.getGradient());
    }
}
