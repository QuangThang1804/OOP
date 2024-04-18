package hus.oop.lap10.observerex1;

public class ObserverTestDrive {
    public static void main(String[] args) {
        Subject subject = new Subject();

        MyObserver observer1 = new ConcreateObserver();
        MyObserver observer2 = new ConcreateObserver2();
        MyObserver observer3  = new ConcreateObserver3();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        System.out.println(subject);

        subject.changeData(1);
        System.out.println(subject);
        System.out.println();

        subject.changeData(2);
        System.out.println(subject);
    }
}
