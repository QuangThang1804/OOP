package bookmanager;

public class GenreComparator implements MyBookComparator {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.compareTo(book2);
    }
}
