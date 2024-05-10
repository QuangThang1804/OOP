package iterator.program;

public class ProductCatalog implements Iterable {
    public String[] productCatalog = {"Bowl", "Chopsticks", "Knife", "Stove", "Spoon"};

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < productCatalog.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return productCatalog[index++];
            }
            return null;
        }
    }
}
