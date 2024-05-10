package com.observer.demoprogram;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
