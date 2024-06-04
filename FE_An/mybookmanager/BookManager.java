package hus.FE_An.mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public MyList getBookList() {
        return this.bookList;
    }

    /**
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        bookList.insertAtPosition(book, index);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        bookList.remove(index);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        Node current = (Node) bookList.get(index);
        return (Book) current.data;
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        double maxPrice = ((Book) bookList.get(0)).getPrice();
        int maxIdxPriceBook = -1;
        for (int i = 1; i < bookList.size(); i++) {
            if (maxPrice < ((Book) bookList.get(i)).getPrice()) {
                maxPrice = ((Book) bookList.get(i)).getPrice();
                maxIdxPriceBook = i;
            }
        }
        return (Book) bookList.get(maxIdxPriceBook);
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        double minPrice = ((Book) bookList.get(0)).getPrice();
        int minIdxPriceBook = -1;
        for (int i = 1; i < bookList.size(); i++) {
            if (minPrice > ((Book) bookList.get(i)).getPrice()) {
                minPrice = ((Book) bookList.get(i)).getPrice();
                minIdxPriceBook = i;
            }
        }
        return (Book) bookList.get(minIdxPriceBook);
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        int highestNumPages = ((Book) bookList.get(0)).getPages();
        int maxIdxNumPagesBook = -1;
        for (int i = 1; i < bookList.size(); i++) {
            if (highestNumPages < ((Book) bookList.get(i)).getPages()) {
                highestNumPages = ((Book) bookList.get(i)).getPages();
                maxIdxNumPagesBook = i;
            }
        }
        return (Book) bookList.get(maxIdxNumPagesBook);
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        int lowestNumPages = ((Book) bookList.get(0)).getPages();
        int minIdxNumPagesBook = -1;
        for (int i = 1; i < bookList.size(); i++) {
            if (lowestNumPages > ((Book) bookList.get(i)).getPages()) {
                lowestNumPages = ((Book) bookList.get(i)).getPages();
                minIdxNumPagesBook = i;
            }
        }
        return (Book) bookList.get(minIdxNumPagesBook);
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        MyList listBookOfPublisher = new MyLinkedList();
        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getPublisher().equals(publisher)) {
                listBookOfPublisher.insertAtEnd(bookList.get(i));
            }
        }
        return listBookOfPublisher;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        MyList listBookOfGenre = new MyLinkedList();
        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getGenre().equals(genre)) {
                listBookOfGenre.insertAtEnd(bookList.get(i));
            }
        }
        return listBookOfGenre;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        MyList listBookOfAuthor = new MyLinkedList();
        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getAuthor().equals(author)) {
                listBookOfAuthor.insertAtEnd(bookList.get(i));
            }
        }
        return listBookOfAuthor;
    }
}
