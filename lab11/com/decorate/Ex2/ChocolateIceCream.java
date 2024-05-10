package com.decorate.Ex2;

public class ChocolateIceCream extends IceCream {
    public ChocolateIceCream(NutsToppingDecorator nutsToppingDecorator) {

    }

    @Override
    String getDescription() {
        return "Chocolate ice cream";
    }
}
