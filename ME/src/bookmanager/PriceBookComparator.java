package bookmanager;

public class PriceBookComparator implements MyBookComparator {

    @Override
    public int compare(Book left, Book right) {
        if (left.getPrice() - right.getPrice() == 0) {
            return 0;
        }
        return (left.getPrice() - right.getPrice() > 0) ? 1 : -1;
    }
}
