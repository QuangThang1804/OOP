package java_projects.src.hus.oop.lab11.iterator_pattern.diagram;

public class ArrayIterator implements MyIterator {
    private String[] products;
    private int length;
    private int currentPosition = 0;

    public ArrayIterator(String[] products) {
        this.products = products;
        this.length = products.length;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < length && products[currentPosition] != null;
    }

    @Override
    public Object next() {
        String result = products[currentPosition];
        currentPosition++;
        return result;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < length - 1; i++) {
            products[i] = products[i+1];
        }
        products[length - 1] = null;
        this.length--;
    }
}
