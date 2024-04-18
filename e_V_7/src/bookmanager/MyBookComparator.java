package bookmanager;

import java.util.Comparator;

public interface MyBookComparator extends Comparator<Book> {
    int compare(Book book1, Book book2);
}
