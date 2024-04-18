package hus.oop.lap10.pizzastore;

import java.util.List;
import java.util.ArrayList;
public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("Prepare" + name);
    }

    public void bake() {
        System.out.println("Baking" + name);
    }

    public void cut() {
        System.out.println("Cut" + name);
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- "). append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings){
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
