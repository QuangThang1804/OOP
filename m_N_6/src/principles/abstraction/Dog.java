package principles.abstraction;

import principles.polymorphism.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("bones");
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                "}";
    }
}
