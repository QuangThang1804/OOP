package mylist;

public class MyArrayListIterator implements MyIterator {
    Object[] data;
    int currentPosition;

    @Override
    public boolean hasNext() {
        return (currentPosition != data.length - 1);
    }

    @Override
    public Object next() {
        return data[currentPosition + 1];
    }
}
