package java_projects.src.hus.oop.lab11.iterator_pattern.diagram;

import java.util.ArrayList;
import java.util.List;

public class ListProduct implements MyIterable {
    private List<String> products;

    public ListProduct() {
        products = new ArrayList<>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String product) {
        products.add(product);
    }
    public List<String> getProducts() {
        return products;
    }

    @Override
    public MyIterator getIterator() {
        return new ListIterator(products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Products:\n");
        MyIterator iterator = getIterator();
        int counter = 0;
        while (iterator.hasNext()) {
            counter++;
            sb.append(counter).append(". ").append(iterator.next()).append('\n');
        }
        return sb.toString().trim();
    }
}
