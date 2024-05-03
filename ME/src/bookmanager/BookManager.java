package bookmanager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    /**
     * Kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPos(Book book, int index) {
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
       return bookList.get(index);
    }



    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo title.
     * @return
     */
    public List<Book> sortIncreasingByTitle() {
        List<Book> sortBook = new ArrayList<>(bookList);
        int n = sortBook.size();
        boolean swapped;
        Book temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (sortBook.get(i - 1).compareTo(sortBook.get(i)) > 0) {
                    temp = sortBook.get(i);
                    sortBook.set(i - 1, sortBook.get(i));
                    sortBook.set(i, temp);
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        return sortBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title tăng dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingTitleAndPrice() {
        List<Book> sortBook = new ArrayList<>(bookList);
        PriceBookComparator priceBookComparator = new PriceBookComparator();
        int n = sortBook.size();
        boolean swapped;
        Book temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (sortBook.get(i - 1).compareTo(sortBook.get(i)) > 0) {
                    temp = sortBook.get(i - 1);
                    sortBook.set(i - 1, sortBook.get(i));
                    sortBook.set(i, temp);
                    swapped = true;
                } else if (sortBook.get(i - 1).compareTo(sortBook.get(i)) == 0) {
                    if (priceBookComparator.compare(sortBook.get(i - 1), sortBook.get(i)) < 0) {
                        temp = sortBook.get(i - 1);
                        sortBook.set(i - 1, sortBook.get(i));
                        sortBook.set(i, temp);
                        swapped = true;
                    }
                }
            }
            n = n - 1;
        } while (swapped);
        return sortBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title giảm dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingTitleAndPrice() {
        List<Book> sortBook = new ArrayList<>(bookList);
        PriceBookComparator priceBookComparator = new PriceBookComparator();
        int n = sortBook.size();
        boolean swapped;
        Book temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (sortBook.get(i - 1).compareTo(sortBook.get(i)) < 0) {
                    temp = sortBook.get(i - 1);
                    sortBook.set(i - 1, sortBook.get(i));
                    sortBook.set(i, temp);
                    swapped = true;
                } else if (sortBook.get(i - 1).compareTo(sortBook.get(i)) == 0) {
                    if (priceBookComparator.compare(sortBook.get(i - 1), sortBook.get(i)) < 0) {
                        temp = sortBook.get(i - 1);
                        sortBook.set(i - 1, sortBook.get(i));
                        sortBook.set(i, temp);
                        swapped = true;
                    }
                }
            }
            n = n - 1;
        } while (swapped);
        return sortBook;
    }

    /**
     * Sắp xếp book theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        PriceBookComparator priceBookComparator = new PriceBookComparator();
        return selectionSort(bookList, priceBookComparator, true, bookList.size());
    }

    /**
     * Sắp xếp book theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        PriceBookComparator priceBookComparator = new PriceBookComparator();
        return selectionSort(bookList, priceBookComparator, false, bookList.size());
    }

    /**
     * Sắp xếp book theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        PagesBookComparator pagesBookComparator = new PagesBookComparator();
        return selectionSort(bookList, pagesBookComparator, true, bookList.size());
    }

    /**
     * Sắp xếp book theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        PagesBookComparator pagesBookComparator = new PagesBookComparator();
        return selectionSort(bookList, pagesBookComparator, false, bookList.size());
    }

    /**
     * Lọc ra howMany book có giá lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPrice(int howMany) {
        PriceBookComparator priceBookComparator = new PriceBookComparator();
        return selectionSort(bookList, priceBookComparator, false, howMany);
    }

    /**
     * Lọc ra những book có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(double lowerBound) {
        List<Book> booksPriceHigherThan = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getPrice() > lowerBound) {
                booksPriceHigherThan.add(book);
            }
        }
        return booksPriceHigherThan;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        PagesBookComparator pagesBookComparator = new PagesBookComparator();
        return selectionSort(bookList, pagesBookComparator, true, howMany);
    }

    // MySelf
    public List<Book> filterBookLowestPrice(int howMany) {
        PriceBookComparator priceBookComparator = new PriceBookComparator();
        return selectionSort(bookList, priceBookComparator, true, howMany);
    }

    /**
     * Lọc ra howMany book có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        List<Book> booksPagesLowerThan = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getPages() > upperBound) {
                booksPagesLowerThan.add(book);
            }
        }
        return booksPagesLowerThan;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        List<Book> booksOfPublisher= new ArrayList<>();
        for (Book book: bookList) {
            if (book.getPublisher().equals(publisher)) {
                booksOfPublisher.add(book);
            }
        }
        return booksOfPublisher;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        List<Book> booksOfGenre= new ArrayList<>();
        for (Book book: bookList) {
            if (book.getGenre().equals(genre)) {
                booksOfGenre.add(book);
            }
        }
        return booksOfGenre;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        List<Book> booksOfAuthor= new ArrayList<>();
        for (Book book: bookList) {
            if (book.getAuthor().equals(author)) {
                booksOfAuthor.add(book);
            }
        }
        return booksOfAuthor;
    }

    // Hàm này sẽ sắp xếp "howMany" phần tử của list copy of bookList
    // theo thứ tự tăng dần (nếu isIncresasing = true)
    // và giảm dần (nếu isIncreasing = false)
    public List<Book> selectionSort(List<Book> listBook,
                                    MyBookComparator myBookComparator,
                                    boolean isIncreasing,
                                    int howMany) {
        List<Book> sortBooks = new LinkedList<>(bookList);
        Book temp;
        int minIdx;
        int maxIdx;
        if (isIncreasing) {
            for (int i = 0; i < howMany; i++) {
                minIdx = i;
                for (int j = i + 1; j < sortBooks.size(); j++) {
                    if (myBookComparator.compare(sortBooks.get(minIdx), sortBooks.get(j)) > 0) {
                        minIdx = j;
                    }
                }
                temp =  sortBooks.get(i);
                sortBooks.set(i, sortBooks.get(minIdx));
                sortBooks.set(minIdx, temp);
            }
        } else {
            for (int i = 0; i < howMany; i++) {
                maxIdx = i;
                for (int j = i + 1; j < sortBooks.size(); j++) {
                    if (myBookComparator.compare(sortBooks.get(maxIdx), sortBooks.get(j)) < 0) {
                        maxIdx = j;
                    }
                }
                temp =  sortBooks.get(i);
                sortBooks.set(i, sortBooks.get(maxIdx));
                sortBooks.set(maxIdx, temp);
            }
        }

        if (howMany == bookList.size()) {
            return sortBooks;
        } else {
            List<Book> sortHowManyBooks = new LinkedList<>();
            for (int i = 0; i < howMany; i++) {
                sortHowManyBooks.add(i, sortBooks.get(i));
            }
            return sortHowManyBooks;
        }
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
        System.out.println();
    }
}
