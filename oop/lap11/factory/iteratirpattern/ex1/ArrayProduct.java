package java_projects.src.hus.oop.lab11.iterator_pattern.diagram;

public class ArrayProduct implements MyIterable {
    String[] productCatalog;
    static final int MAX_PRODUCTS = 8;
    int numProducts = 0;

    public ArrayProduct() {
        productCatalog = new String[MAX_PRODUCTS];

        addItem("Vegetarian BLT");
        addItem("BLT");
        addItem("Soup of the day");
        addItem("Hotdog");
        addItem("Steamed Veggies and Brown Rice");
        addItem("Pasta");
    }

    public void addItem(String product) {
        if (numProducts >= productCatalog.length) {
            allocateMore();
        }
        productCatalog[numProducts] = product;
        numProducts++;
    }
    public void allocateMore() {
        String[] temp = new String[2 * productCatalog.length];
        System.arraycopy(productCatalog, 0, temp, 0, productCatalog.length);
        productCatalog = temp;
    }
    @Override
    public MyIterator getIterator() {
        return new ArrayIterator(productCatalog);
    }
    public String[] getProducts() {
        return productCatalog;
    }
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
