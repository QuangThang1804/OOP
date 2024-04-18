package hus.oop.lap10.strategy;

public class StrategyTestDrive {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        System.out.println(dataSet);

        dataSet.setStrategy(new BubbleSort());
        dataSet.sort();
        System.out.println(dataSet);

        dataSet.reset();
        System.out.println(dataSet);
    }
}
