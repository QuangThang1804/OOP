package com.decorate.Ex2;

public class HoneyToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    @Override
    String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    String addTopping() {
        return "With honey topping &";
    }
}
