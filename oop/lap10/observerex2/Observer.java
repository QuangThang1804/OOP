package hus.oop.lap10.observerex2;

import java.util.LinkedList;
import java.util.List;
public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
