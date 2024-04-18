package bookmanager;

public class PagesComparator implements MyBookComparator{

    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getPages() - book2.getPages() == 0) {
            return 0;
        }
        return (book1.getPages() - book2.getPages() > 0) ? 1 : -1;
    }
}
