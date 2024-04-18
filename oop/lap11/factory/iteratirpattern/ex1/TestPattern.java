package java_projects.src.hus.oop.lab11.iterator_pattern.diagram;

public class TestPattern {
    public static void main(String[] args) {
        ArrayProduct arrayProducts = new ArrayProduct();

        arrayProducts.addItem("Spring rolls");
        arrayProducts.addItem("Beef Wellington");
        arrayProducts.addItem("Scallops");
        System.out.println(arrayProducts);

        ListProduct listProducts = new ListProduct();

        listProducts.addItem("Pho");
        listProducts.addItem("Banh mi");
        System.out.println(listProducts);
    }
}
