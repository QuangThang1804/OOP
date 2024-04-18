package hus.oop.lap10.strategy;

import java.util.Arrays;

public class DataSet {
    private Sorter strategy;
    private int[] data;

    public void reset() {
        DataSet originalData = new DataSet();
        data = originalData.data;
    }
    public DataSet() {
        data = new int[] {5,1,3,7,9,4,8};
    }

    public void setStrategy(Sorter strategy) {
        this.strategy = strategy;
    }
    public void sort() {
        this.strategy.sort(this.data);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.data);
    }
}