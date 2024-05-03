package bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    private static final BookManager bookManager = new BookManager();

    public static void main(String[] args) {
        init();
        testOriginalData();
        testFilterBooksHighestPrice();
        testFilterBooksLowestPrice();
        testFilterBooksOfAuthor();
        testFilterBooksOfGenre();
        testFilterBooksOfPublisher();
        testPriceOfBooksDecreasing();
        testPriceOfBooksIncreasing();
        testSortDecreasingTitleAndPrice();
        testSortIncreasingTitleAndPrice();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BookManager>.txt (Ví dụ, NguyenVanA_123456_BookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookManager>.zip (Ví dụ, NguyenVanA_123456_BookManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "ME/src/bookmanager/data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }
                Book newBook = new Book.BookBuilder(dataList.get(0))
                        .withAuthor(dataList.get(1))
                        .withGenre(dataList.get(2))
                        .withPages(Integer.parseInt(dataList.get(3)))
                        .withPrice(Double.parseDouble(dataList.get(4)))
                        .withPublisher(dataList.get(5))
                        .build();
                bookManager.insertAtEnd(newBook);

                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào bookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        List<Book> books = bookManager.getBookList();
        System.out.print(books);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo tiêu chí, đầu tiên theo title tăng dần, sau đó theo giá giảm dần.
     */
    public static void testSortIncreasingTitleAndPrice() {
        System.out.println("Test SortIncreasingTitleAndPrice");
        BookManager.print(bookManager.sortIncreasingTitleAndPrice());
        System.out.println();
    }

    /**
     * Test sắp xếp book theo tiêu chí, đầu tiên theo title giảm dần, sau đó theo giá giảm dần.
     */
    public static void testSortDecreasingTitleAndPrice() {
        System.out.println("Test SortDecreasingTitleAndPrice");
        BookManager.print(bookManager.sortDecreasingTitleAndPrice());
        System.out.println();
    }

    /**
     * Test sắp xếp book theo giá tăng dần.
     */
    public static void testPriceOfBooksIncreasing() {
        System.out.println("Test PriceOfBooksIncreasing");
        BookManager.print(bookManager.sortIncreasingPrice());
        System.out.println();
    }

    /**
     * Test sắp xếp book theo giá giảm dần
     */
    public static void testPriceOfBooksDecreasing() {
        System.out.println("Test PriceOfBooksDecreasing");
        BookManager.print(bookManager.sortDecreasingPrice());
        System.out.println();
    }

    /**
     * Test lọc ra những book có giá rẻ nhất.
     */
    public static void testFilterBooksLowestPrice() {
        System.out.println("Test FilterBooksLowestPrice get 5 books have lowest price");
        BookManager.print(bookManager.filterBookLowestPrice(5));
        System.out.println();
    }

    /**
     * Test lọc ra những book có giá cao nhất.
     */
    public static void testFilterBooksHighestPrice() {
        System.out.println("Test FilterBooksHighestPrice get 5 books have highest price");
        BookManager.print(bookManager.filterHighestPrice(5));
        System.out.println();
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        System.out.println("test FilterBooksOfAuthor get books of author Deshpande PL");
        BookManager.print(bookManager.filterBooksOfAuthor("Deshpande PL"));
        System.out.println();
    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        System.out.println("test FilterBooksOfPublisher get books of publisher HarperCollins");
        BookManager.print(bookManager.filterBooksOfPublisher("HarperCollins"));
        System.out.println();
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        System.out.println("Test FilterBooksOfGenre get books of genre history");
        BookManager.print(bookManager.filterBooksOfGenre("history"));
        System.out.println();
    }
}
