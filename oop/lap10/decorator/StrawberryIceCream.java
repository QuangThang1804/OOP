package hus.oop.lap10.decorator;

public class StrawberryIceCream implements IceCream{
    private String description;
    private int price;

    public StrawberryIceCream() {
        this.price = 2;
        this.description = "Strawberry";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int cost() {
        return this.price;
    }
}
