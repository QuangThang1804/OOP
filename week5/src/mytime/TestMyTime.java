package mytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime();
        System.out.println(myTime1);

        MyTime myTime2 = new MyTime(1, 2, 3);
        System.out.println(myTime2);

        myTime2.setTime(2, 3, 4);
        System.out.println(myTime2);
        myTime2.setHour(5);
        myTime2.setMinute(50);
        myTime2.setSecond(55);
        System.out.println("second is: " + myTime2.getSecond());
        System.out.println("minute is: " + myTime2.getMinute());
        System.out.println("second is: " + myTime2.getSecond());

        MyTime myTime3 = new MyTime(2, 58, 59);
        System.out.println(myTime3.nextSecond().toString());
        System.out.println(myTime3.nextMinute().toString());
        System.out.println(myTime3.nextHour().toString());

        MyTime myTime4 = new MyTime(1, 0, 0);
        System.out.println(myTime4.previousSecond().toString());
        System.out.println(myTime4.previousMinute().toString());
        System.out.println(myTime4.previousHour().toString());
    }
}
