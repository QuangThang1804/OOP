package strategypattern.strategypusedo;

public class Context {
    private Strategy strategy;
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
