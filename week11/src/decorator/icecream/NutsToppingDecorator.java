package decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;
    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    String addTopping() {
        return " with nuts topping";
    }
}
