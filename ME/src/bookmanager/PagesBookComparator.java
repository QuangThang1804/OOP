package bookmanager;

public class PagesBookComparator implements MyBookComparator {
    @Override
    public int compare(Book left, Book right) {
        if (left.getPages() - right.getPages() == 0) {
            return 0;
        }
        return (left.getPages() - right.getPages() > 0) ? 1 : -1;
    }
}
