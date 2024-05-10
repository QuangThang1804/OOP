package iterator.program;

public class IteratorPatternEx {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Iterator iterator = productCatalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Product Name: " + iterator.next());
        }
    }
}
