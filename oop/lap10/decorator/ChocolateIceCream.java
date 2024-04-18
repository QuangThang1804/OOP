package hus.oop.lap10.decorator;

public class ChocolateIceCream implements IceCream{
    private String description;
    private int price;

    public ChocolateIceCream() {
        this.price = 3;
        this.description = "Chocolate";
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
