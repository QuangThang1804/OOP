package hus.oop.lap10.observerex1;

import java.util.LinkedList;
import java.util.List;
public class Subject {
    private int mainState;

    private List<MyObserver> obsevers;

    public Subject() {
        this.mainState = 6;
        this.obsevers = new LinkedList<>();
    }

    public void registerObserver(MyObserver myObserver){
        this.obsevers.add(myObserver);
    }
    public void remove(MyObserver myObserver){
        this.obsevers.remove(myObserver);
    }
    public void changeData(int newData){
        this.mainState = newData;
    }
    private void dataChange(int newData){
        if (this.mainState == newData){
            return;
        }
        this.mainState = newData;
        dataChange();
    }
    private void dataChange(){
        notifyObserver();
    }
    public void notifyObserver(){
        for (MyObserver myObserver : this.obsevers){
            myObserver.update(this.mainState);
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "mainState=" + mainState +
                '}';
    }
}
