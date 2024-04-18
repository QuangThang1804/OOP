package hus.oop.lap10.decorator;

public class DecoratorTestDrive {
    public static void main(String[] args) {
        IceCream vani = new VanillaIceCream();
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        IceCream chocolate = new ChocolateIceCream();
        System.out.println(chocolate.getDescription());
        System.out.println(chocolate.cost());


        vani = new HoneyTopping(vani);
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        chocolate = new HoneyTopping(chocolate);
        System.out.println(chocolate.getDescription());
        System.out.println(chocolate.cost());
    }
}
