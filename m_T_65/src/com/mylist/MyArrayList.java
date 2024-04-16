package com.mylist;

public class MyArrayList extends MyAbstracList{
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        if (!checkBoundaries(index, size)) {
            if (size >= elements.length - 1) {
                enlarge();
            }
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = o;
            size++;
        } else {
            System.out.println("index out of range!");
        }
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (!checkBoundaries(index, size)) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
        }
        size--;
    }

    @Override
    public int size() {
        return 0;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
