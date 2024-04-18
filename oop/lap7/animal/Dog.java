package hus.oop.lap7.animal;

public class Dog extends Animal {
    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooooooooof");
    }

    public Dog(String name) {
        super(name);
    }
}
