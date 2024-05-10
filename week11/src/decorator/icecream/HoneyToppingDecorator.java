package decorator.icecream;

public class HoneyToppingDecorator extends ToppingDecorator{
    private IceCream iceCream;
    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    String addTopping() {
        return " with honey topping";
    }
}
