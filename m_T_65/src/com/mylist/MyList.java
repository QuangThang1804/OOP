package com.mylist;

public interface MyList {
    void add(Object o);
    void add(Object o, int index);
    Object get(int index);
    void remove(int index);
    int size();
}
