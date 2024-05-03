package strategypattern.strategypusedo;

import java.util.Stack;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
