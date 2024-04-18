package hus.oop.lap10.decorator;

public abstract class IceCreamDecorator implements IceCream{
    protected IceCream swappee;

    public IceCreamDecorator(IceCream swappee) {
        this.swappee = swappee;
    }

    @Override
    public String getDescription() {
        return swappee.getDescription();
    }

    @Override
    public int cost() {
        return swappee.cost();
    }
}
