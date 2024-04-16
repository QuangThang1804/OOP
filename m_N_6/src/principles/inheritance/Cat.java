package principles.inheritance;

public class Cat extends Animal {
    private String breed;
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                super.toString() +
                "breed='" + breed + '\'' +
                '}';
    }
}
