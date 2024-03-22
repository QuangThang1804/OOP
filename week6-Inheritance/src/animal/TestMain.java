package animal;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("KIKI");
        System.out.println(animal);

        Mammal mammal = new Mammal("KAKA");
        System.out.println(mammal);

        Cat cat = new Cat("Meoz");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Milu");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Maika");
        System.out.println(dog2);
        dog1.greets(dog2);
    }
}
