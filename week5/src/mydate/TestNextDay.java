package mydate;

public class TestNextDay {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2011, 12, 28);
        System.out.println(date1);
        int i = 0;
        while (i++ < 65) {
            System.out.println(date1.nextDay());
        }
    }
}
