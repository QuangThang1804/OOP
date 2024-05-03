package bookmanager;

import java.util.*;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

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

    public List<Book> sort(List<Book> listBook,
                           MyBookComparator myBookComparator,
                           boolean isIncreasing,
                           int howMany) {
        List<Book> sortList = new LinkedList<>(listBook);
        int n = sortList.size();
        boolean swapped;
        Book temp;
        if (isIncreasing) {
            do {
                swapped = false;
                for (int i = 1; i < n; i++) {
                    if (myBookComparator.compare(listBook.get(i - 1), listBook.get(i)) > 0) {
                        temp = sortList.get(i - 1);
                        sortList.set(i - 1, sortList.get(i));
                        sortList.set(i, temp);
                        swapped = true;
                    }
                }
                n = n - 1;
            } while (swapped);
        } else {
            do {
                swapped = false;
                for (int i = 1; i < n; i++) {
                    if (myBookComparator.compare(listBook.get(i - 1), listBook.get(i)) < 0) {
                        temp = sortList.get(i - 1);
                        sortList.set(i - 1, sortList.get(i));
                        sortList.set(i, temp);
                        swapped = true;
                    }
                }
                n = n - 1;
            } while (swapped);
        }
        return sortList;
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        boolean inOfRange = true;
        if (index < 0 || index > limit) {
            inOfRange = false;
        }
        return inOfRange;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void append(Book book) {
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
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
     * Sắp xếp danh sách book theo thứ tự tăng dần theo genre và sau đó đến title.
     * @return
     */
    public List<Book> sortIncreasingByGenreAndTitle() {
        int n = bookList.size();
        boolean swapped;
        Book temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (bookList.get(i - 1).compareTo(bookList.get(i)) > 0) {
                    temp = bookList.get(i - 1);
                    bookList.set(i - 1, bookList.get(i));
                    bookList.set(i, temp);
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        return new LinkedList<>(bookList);
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingGenreAndPrice() {
        List<Book> sortBooks = new LinkedList<>(bookList);
        sortBooks.sort(new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                if (book1.getGenre().compareTo(book2.getGenre()) != 0) {
                    return book1.getGenre().compareTo(book2.getGenre());
                }

                if (book1.getPrice() == book2.getPrice()) {
                    return 0;
                }
                // Neu gia cua book1 < gia cua book2 thi reverse
                return book1.getPrice() - book2.getPrice() < 0 ? 1 : -1;
            }
        });
//        MyBookComparator priceComparator = new PriceComparator();
//        int n = bookList.size();
//        boolean swapped;
//        Book temp;
//        do {
//            swapped = false;
//            for (int i = 1; i < n; i++) {
//                if (bookList.get(i - 1).compareTo(bookList.get(i)) > 0) {
//                    temp = bookList.get(i - 1);
//                    bookList.set(i - 1, bookList.get(i));
//                    bookList.set(i, temp);
//                    swapped = true;
//                } else if (bookList.get(i - 1).compareTo(bookList.get(i)) == 0){
//                    if (priceComparator.compare(bookList.get(i - 1), bookList.get(i)) < 0) {
//                        temp = bookList.get(i - 1);
//                        bookList.set(i - 1, bookList.get(i));
//                        bookList.set(i, temp);
//                        swapped = true;
//                    }
//                }
//            }
//            n = n - 1;
//        } while (swapped);
//        return new LinkedList<>(bookList);
        return sortBooks;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingGenreAndPrice() {
        List<Book> sortBooks = new LinkedList<>(bookList);
//        sortBooks.sort(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                // neu genre cua book1 < genre cua book2 thi reverse
//                if (o1.getGenre().compareTo(o2.getGenre()) != 0) {
//                    return -o1.getGenre().compareTo(o2.getGenre());
//                }
//                if (o1.getPrice() - o2.getPrice() == 0) {
//                    return 0;
//                }
//                // neu price cua book1 < price cua book2 thi reverse
//                return (o1.getPrice() - o2.getPrice() < 0) ? 1 : -1;
//            }
//        });

        Collections.sort(sortBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getGenre().compareTo(o2.getGenre()) != 0) {
                    return -o1.getGenre().compareTo(o2.getGenre());
                }
                if (o1.getPrice() - o2.getPrice() == 0) {
                    return 0;
                }
                // neu price cua book1 < price cua book2 thi reverse
                return (o1.getPrice() - o2.getPrice() < 0) ? 1 : -1;
            }
        });

//        PriceComparator priceComparator = new PriceComparator();
//        int n = bookList.size();
//        boolean swapped;
//        Book temp;
//        do {
//            swapped = false;
//            for (int i = 1; i < n; i++) {
//                if (bookList.get(i - 1).compareTo(bookList.get(i)) < 0) {
//                    temp = bookList.get(i - 1);
//                    bookList.set(i - 1, bookList.get(i));
//                    bookList.set(i, temp);
//                    swapped = true;
//                } else {
//                    if (priceComparator.compare(bookList.get(i - 1), bookList.get(i)) < 0) {
//                        temp = bookList.get(i - 1);
//                        bookList.set(i - 1, bookList.get(i));
//                        bookList.set(i, temp);
//                        swapped = true;
//                    }
//                }
//            }
//            n = n - 1;
//        } while (swapped);
//        return new LinkedList<>(bookList);
        return sortBooks;
    }

    /**
     * Sắp xếp sách theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        PriceComparator priceComparator = new PriceComparator();
        return selectionSort(bookList, priceComparator, true, bookList.size());
    }

    /**
     * Sắp xếp sách theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        PriceComparator priceComparator = new PriceComparator();
        return selectionSort(bookList, priceComparator, false, bookList.size());
    }

    /**
     * Sắp xếp sách theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        PagesComparator pagesComparator = new PagesComparator();
        return selectionSort(bookList, pagesComparator, true, bookList.size());
    }

    /**
     * Sắp xếp sách theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        PagesComparator pagesComparator = new PagesComparator();
        return selectionSort(bookList, pagesComparator, false, bookList.size());
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        MyBookComparator pagesComparator = new PagesComparator();
        return selectionSort(bookList, pagesComparator, false, howMany);
    }

    public List<Book> filterHighestPrice(int howMany) {
        MyBookComparator priceComparator = new PriceComparator();
        return selectionSort(bookList, priceComparator, false, howMany);
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(int lowerBound) {
        List<Book> booksPagesHigherThan = new LinkedList<>();
        for (Book book: bookList) {
            if (book.getPages() > lowerBound) {
                booksPagesHigherThan.add(book);
            }
        }
        return booksPagesHigherThan;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
         MyBookComparator pagesComparator = new PagesComparator();
         return selectionSort(bookList, pagesComparator, true, howMany);
    }

    public List<Book> filterBookLowestPrice(int howMany) {
        MyBookComparator priceComparator = new PriceComparator();
        return selectionSort(bookList, priceComparator, true, howMany);
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        List<Book> booksPagesLowerThan = new LinkedList<>();
        for (Book book: bookList) {
            if (book.getPages() < upperBound) {
                booksPagesLowerThan.add(book);
            }
        }
        return booksPagesLowerThan;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        List<Book> booksOfPublisher = new LinkedList<>();
        for (Book book: bookList) {
            if (book.getPublisher().equals(publisher)) {
                booksOfPublisher.add(book);
            }
        }
        return booksOfPublisher;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        List<Book> booksOfPublisher = new LinkedList<>();
        for (Book book: bookList) {
            if (book.getGenre().equals(genre)) {
                booksOfPublisher.add(book);
            }
        }
        return booksOfPublisher;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        List<Book> booksOfPublisher = new LinkedList<>();
        for (Book book: bookList) {
            if (book.getAuthor().equals(author)) {
                booksOfPublisher.add(book);
            }
        }
        return booksOfPublisher;
    }

    public int size() {
        return bookList.size();
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
