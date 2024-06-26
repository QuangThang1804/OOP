package hus.oop.lap10.pizzastore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        System.out.println();
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        pizza = store.orderPizza("greek");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
