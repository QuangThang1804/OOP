package iterator.ex3example;

public class Item {
    private String name;
    private String id;

    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item:[name = " + name + ", id = " + id + "]";
    }
}
