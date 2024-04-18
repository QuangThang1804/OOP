package hus.oop.lap11.factory.factorymethod.ex2;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }

        throw new IllegalArgumentException("Invalid pizza type: " + type);
    }
}
