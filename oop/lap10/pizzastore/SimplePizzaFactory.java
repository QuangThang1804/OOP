package hus.oop.lap10.pizzastore;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        if (type.equals("chess")){
            return new CheesePizza();
        }else if (type.equals("greek")) {
            return new GreekPizza();
        }else if (type.equals("pepperoni")){
            return new PepperoniPizza();
        }else {
            return null;
        }
    }
}
