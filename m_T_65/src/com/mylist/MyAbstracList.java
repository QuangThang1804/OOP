package com.mylist;

public class MyAbstracList implements MyList{
    boolean checkBoundaries(int index, int limit){
        boolean outRange = false;
        if (index < 0 || index > limit) {
            outRange = true;
        }
        return outRange;
    }
    @Override
    public void add(Object o) {

    }

    @Override
    public void add(Object o, int index) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s]", get(i).toString()));
        }
        return sb.toString();
    }
}
