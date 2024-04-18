package hus.oop.lap10.decorator;

public class VanillaIceCream implements IceCream{
    private String description;
    private int cost;

    public VanillaIceCream() {
        this.description = "Vani Cream ";
        this.cost = 1;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int cost() {
        return this.cost;
    }
}
