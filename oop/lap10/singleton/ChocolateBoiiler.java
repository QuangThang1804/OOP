package hus.oop.lap10.singleton;

public class ChocolateBoiiler {
    private static ChocolateBoiiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiller");
            uniqueInstance = new ChocolateBoiiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
