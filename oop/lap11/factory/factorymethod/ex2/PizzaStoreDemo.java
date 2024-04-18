package hus.oop.lap11.factory.factorymethod.ex2;

public class PizzaStoreDemo {
    public static void main(String[] args) {
        PizzaStore newYorkStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza cheesePizza = newYorkStore.orderPizza("cheese");
        System.out.println("First pizza ordered: " + cheesePizza);

        Pizza pepperoniPizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Second pizza ordered: " + pepperoniPizza);
    }
}
