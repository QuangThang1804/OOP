package hus.oop.lap11.factory.factorymethod.ex3;

public class FruitFactory {
    public Fruit provideFruit(String type){
        if (type.equals("Apple")){
            return new Apple();
        }
        if (type.equals("Banana")){
            return new Banana();
        }
        if (type.equals("Orange")){
            return new Orange();
        } return null;
    }
}
