package mylist;

public class MyArrayListIterator implements MyIterator {
    Object[] data;
    int currentPosition;

    public MyArrayListIterator(Object[] data) {
        this.data = data;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        currentPosition++;
        return (currentPosition <= data.length - 1 && data[currentPosition] != null);
    }

    @Override
    public Object next() {
        return data[currentPosition + 1];
    }
}
