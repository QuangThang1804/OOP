package strategypattern.strategypusedo;

public class ConcreteStrategySubstract implements Strategy {
    public int execute(int a, int b) {
        return a - b;
    }
}
