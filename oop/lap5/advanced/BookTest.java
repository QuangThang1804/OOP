package hus.oop.lap5.advanced;

public class BookTest {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@somewhere.com", 'm');

        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);
        System.out.println(dummyBook);
        System.out.println(dummyBook.getAuthorName());
    }
}
