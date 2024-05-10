package decorator.icecream;

public class IceCreamApp {
    public static void main(String[] args) {
        IceCream vaniIceCreamWithHoneyTopping =
                new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println("Order: " + vaniIceCreamWithHoneyTopping.getDescription());

        IceCream strawberryCreamWithNutsTopping =
                new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println("Order: " + strawberryCreamWithNutsTopping.getDescription());

        IceCream chocolateIceCreamWithHoneyAndNutsTopping = new HoneyToppingDecorator
                (new NutsToppingDecorator(new ChocolateIceCream()));
        System.out.println("Order: " + chocolateIceCreamWithHoneyAndNutsTopping.getDescription());
    }
}
