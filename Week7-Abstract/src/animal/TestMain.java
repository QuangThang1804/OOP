package animal;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Mun");
        cat.greets();

        Dog dog1 = new Dog("Maika");
        Dog dog2 = new Dog("Nick");
        dog1.greets();
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Banh");
        BigDog bigDog2 = new BigDog("Bao");
        bigDog1.greets();
        bigDog1.greets(dog1);
        bigDog1.greets(bigDog2);
    }
}
