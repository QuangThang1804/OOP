package sortstrategy;

public class SortStrategy {
    private static SortStrategy instance;

    private ISort sortee;

    private SortStrategy() {
        sortee = new BubbleSort();
    }

    public static SortStrategy getInstance() {
        if (instance == null) {
            return instance = new SortStrategy();
        }
        return instance;
    }

    public void setSortee(ISort sortee) {
        this.sortee = sortee;
    }

    public int sort(int[] data) {
        this.sortee.sort(data);
    }
}
