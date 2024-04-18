package hus.oop.lap10.decorator;

public class HoneyTopping extends IceCreamDecorator{
    private int price;
    private String descriptioon;

    public HoneyTopping(IceCream swappee) {
        super(swappee);
        this.price = 1;
        this.descriptioon = "Honey";
    }

    @Override
    public String getDescription() {
        return this.swappee.getDescription() + " " + this.descriptioon;
    }

    @Override
    public int cost() {
        return this.swappee.cost() + this.price;
    }
}
