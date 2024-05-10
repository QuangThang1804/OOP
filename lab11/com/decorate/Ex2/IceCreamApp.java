package com.decorate.Ex2;

public class IceCreamApp {
    public static void main(String[] args) {
        IceCream vanillaIceCreamWithHoneyTopping = new HoneyToppingDecorator();
        String vanillaIceCreamWithHoneyToppingDescription = vanillaIceCreamWithHoneyTopping.getDescription();
        System.out.println("You ordered: " + vanillaIceCreamWithHoneyToppingDescription.trim());

        IceCream strawberryCreamWithNutsTopping = new StrawberryIceCream(new NutsToppingDecorator());
        String strawberryCreamWithNutsToppingDescription = strawberryCreamWithNutsTopping.getDescription();
        System.out.println("You ordered: " + strawberryCreamWithNutsToppingDescription.trim());

        IceCream chocolateIceCreamWithHoneyAndNutsTopping = new ChocolateIceCream(new NutsToppingDecorator());
        String chocolateIceCreamWithHoneyAndNutsToppingDescription = chocolateIceCreamWithHoneyAndNutsTopping.getDescription();
        System.out.println("You ordered: " + chocolateIceCreamWithHoneyAndNutsToppingDescription.trim());
    }
}
