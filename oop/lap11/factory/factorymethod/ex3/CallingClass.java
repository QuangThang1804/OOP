package hus.oop.lap11.factory.factorymethod.ex3;

public class CallingClass {
    public static void main(String[] args) {
        Fruit fruit1 = new Apple();
        FruitFactory fruit1Factory = new FruitFactory();
        fruit1Factory.provideFruit(fruit1.produceJuice());
        System.out.println();

        Fruit fruit2 = new Banana();
        FruitFactory fruit2Factory = new FruitFactory();
        fruit2Factory.provideFruit(fruit2.produceJuice());
        System.out.println();

        Fruit fruit3 = new Orange();
        FruitFactory fruit3Factory = new FruitFactory();
        fruit3Factory.provideFruit(fruit3.produceJuice());

    }
}
