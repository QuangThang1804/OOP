package com.decorate.Ex2;

public class StrawberryIceCream extends IceCream {
    public StrawberryIceCream(NutsToppingDecorator nutsToppingDecorator) {

    }

    @Override
    String getDescription() {
        return "Strawberry ice cream";
    }
}
