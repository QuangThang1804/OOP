package bookmanager;

public class PriceComparator implements MyBookComparator {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getPrice() - o2.getPrice() == 0) {
            return 0;
        } else if (o1.getPrice() - o2.getPrice() > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
