package strategypattern.strategypusedo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        String action = input.next();
        Context context = new Context();
        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if (action.equals("substraction")) {
            context.setStrategy(new ConcreteStrategySubstract());
        }
        if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executeStrategy(number1, number2);
        System.out.println(result);
    }
}
