package hus.oop.lap10.observerex2;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private int state;

    private List<Observer> obsevers;

    public Subject() {
        this.state = 6;
        this.obsevers = new LinkedList<>();
    }

    public int getState() {
        return state;
    }
    public void setState(int state){
        this.state = state;
        notifyObservers();
    }
    public void attach(Observer observer){
        obsevers.add(observer);
    }


    public void notifyObservers(){
        for (Observer Observer : this.obsevers){
            Observer.update();
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "mainState=" + state +
                '}';
    }
}
