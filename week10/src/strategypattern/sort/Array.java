package strategypattern.sort;

public class Array {
    private int[] array;
    private SortAlgorithms sortAlgorithms;

    public Array(int[] array) {
        this.array = array;
    }

    public void setSortAlgorithms(SortAlgorithms sortAlgorithms) {
        this.sortAlgorithms = sortAlgorithms;
    }

    public int[] getArray() {
        return array;
    }

    public void sort() {
        this.sortAlgorithms.sort(this.array);
    }
}
