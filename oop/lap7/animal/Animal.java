package hus.oop.lap7.animal;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
