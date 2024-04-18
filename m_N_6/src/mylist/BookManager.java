package mylist;

public class BookManager {
    MyList books;

    public BookManager(MyList books) {
        this.books = books;
    }

    public MyList sortByPageNumber(boolean isIncrease) {
        MyList sortBooks = new MyArrayList();
        PagesBookComparator pagesBookComparator = new PagesBookComparator();
        Book temp;
        for (int i = 0; i < sortBooks.size() - 1; i++) {
            for (int j = i + 1; j < sortBooks.size(); j++) {
                if (pagesBookComparator.compare((Book) sortBooks.get(i), (Book) sortBooks.get(j)) > 0) {
                    temp = (Book) sortBooks.get(i);
                    sortBooks.set(sortBooks.get(j), i);
                    sortBooks.set(temp, j);
                }
            }
        }
        return sortBooks;
    }
}
