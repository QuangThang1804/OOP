package hus.oop.lap10.pizzastore;

public class PizzaStore {
    private SimplePizzaFactory facory;
    public PizzaStore(SimplePizzaFactory factory){
        this.facory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = facory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
