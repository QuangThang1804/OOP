package bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static bookmanager.BookManager.print;

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
        testSortDecreasingGenreAndPrice();
        testSortIncreasingGenreAndPrice();

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
        String filePath = "e_V_7/src/bookmanager/data/books.csv";
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
                bookManager.append(newBook);
//                if (bookManager.size() == 5) {
//                    break;
//                }

                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào bookManager để quản lý.

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
    }

    /**
     * Test sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, sau đó theo giá giảm dần.
     */
    public static void testSortIncreasingGenreAndPrice() {
        System.out.println("test SortIncreasingGenreAndPrice");
        print(bookManager.sortIncreasingGenreAndPrice());
        System.out.println();
    }

    /**
     * Test sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, sau đó theo giá giảm dần.
     */
    public static void testSortDecreasingGenreAndPrice() {
        System.out.println("test SortDecreasingGenreAndPrice");
        print(bookManager.sortDecreasingGenreAndPrice());
        System.out.println();
    }

    /**
     * Test sắp xếp sách theo giá tăng dần.
     */
    public static void testPriceOfBooksIncreasing() {
        System.out.println("test PriceOfBooksIncreasing");
        print(bookManager.sortIncreasingPrice());
        System.out.println();
    }

    /**
     * Test sắp xếp sách theo giá giảm dần
     */
    public static void testPriceOfBooksDecreasing() {
        System.out.println("test PriceOfBooksDecreasing");
        print(bookManager.sortDecreasingPrice());
        System.out.println();
    }

    /**
     * Test lọc sách có giá rẻ nhất.
     */
    public static void testFilterBooksLowestPrice() {
        System.out.println("test FilterBooksLowestPrice");
        print(bookManager.filterBookLowestPrice(5));
        System.out.println();
    }

    /**
     * Test lọc sách có giá cao nhất.
     */
    public static void testFilterBooksHighestPrice() {
//        List<Book> highestPrice = bookManager.filterHighestPrice(5);
//        System.out.println(highestPrice.toString());
        System.out.println("test FilterBooksHighestPrice");
        print(bookManager.filterHighestPrice(5));
        System.out.println();
    }

    /**
     * Test lọc sách theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        System.out.println("test FilterBooksOfAuthor");
        print(bookManager.filterBooksOfAuthor("Steinbeck John"));
        System.out.println();
    }

    /**
     * Test lọc sách theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        System.out.println("test FilterBooksOfPublisher");
        print(bookManager.filterBooksOfPublisher("Wiley"));
        System.out.println();
    }

    /**
     * Test lọc sách theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        System.out.println("test FilterBooksOfGenre");
        print(bookManager.filterBooksOfGenre("history"));
        System.out.println();
    }
}
