package hus.oop.lap10.singleton;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiiler chocolateBoiiler1 = ChocolateBoiiler.getInstance();
        ChocolateBoiiler chocolateBoiiler2 = ChocolateBoiiler.getInstance();

        System.out.println(chocolateBoiiler1);
        System.out.println(chocolateBoiiler2);

        if (chocolateBoiiler1 == chocolateBoiiler2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
