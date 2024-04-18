package hus.oop.lap10.observerex1;

public class ConcreateObserver2 implements MyObserver{
    @Override
    public void update(int newData){
        System.out.println("Observer2 is updated");
    }
}
