package java_projects.src.hus.oop.lab11.iterator_pattern.diagram;

import java.util.List;

public class ListIterator implements MyIterator {
    private List<String> products;
    private int currentPosition = 0;

    public ListIterator(List<String> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < products.size();
    }

    @Override
    public Object next() {
        String result = products.get(currentPosition);
        currentPosition++;
        return result;
    }

    @Override
    public void remove(int index) {
        this.products.remove(index);
    }
}
