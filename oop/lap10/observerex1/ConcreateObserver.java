package hus.oop.lap10.observerex1;

public class ConcreateObserver implements MyObserver {
    @Override
    public void update(int newData){
        System.out.println("Observer1 is updated");
    }
}
