package com.decorate.Ex2;

public class NutsToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public NutsToppingDecorator() {

    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    String addTopping() {
        return "With nuts topping &";
    }
}
