package hus.oop.lap10.observerex1;

public class ConcreateObserver3 implements MyObserver {
    @Override
    public void update(int newData){
        System.out.println("Observer3 is updated");
    }
}
