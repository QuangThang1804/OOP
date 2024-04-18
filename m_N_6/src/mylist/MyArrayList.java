package mylist;

public class MyArrayList extends MyAbstractList{
    final int DEFAULT_CAPACITY = 16;
    Object[] data;
    int size;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void append(Object o) {
        if (size > data.length - 1) {
            enlarge();
        }
        data[size++] = o;
    }

    private void enlarge() {
        Object[] newArr = new Object[size + DEFAULT_CAPACITY];
        System.arraycopy(data, 0, newArr, 0, data.length);
        data = newArr;
    }

    @Override
    public MyIterable iterator() {
        return null;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public void insert(Object o, int index) {
        if (size >= data.length - 1) {
            enlarge();
        }

        for (int i = size; i >= 0; i--) {
            data[i] = data[i - 1];
        }
        data[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public void set(Object o, int index) {
        data[index] = o;
    }

    @Override
    public int size() {
        return size;
    }
}
