package countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    private static CountryListManager countryListManager = CountryListManager.getInstance();

    public static void main(String[] args) {

        // Viết code cho các hàm test.
        // Kết quả chạy chương trình lưu vào file <Mã số sinh viên>CountryListManager.txt và nộp cùng source code.
        init();
        testOriginalData();

        testSortDecreasingByArea();
        System.out.println();
        testSortIncreasingByArea();
        System.out.println();
        testSortDecreasingByGdp();
        System.out.println();
        testSortIncreasingByGdp();
        System.out.println();
        testSortDecreasingByPopulation();
        System.out.println();
        testSortIncreasingByPopulation();

        System.out.println();
        testFilterHighestGdpCountries();
        System.out.println();
        testFilterLowestGdpCountries();
        System.out.println();
        testFilterLargestAreaCountries();
        System.out.println();
        testFilterSmallestAreaCountries();
        System.out.println();
        testFilterLeastPopulousCountries();
        System.out.println();
        testFilterMostPopulousCountries();
        System.out.println();
        testFilterContinent();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            //dataReader = new BufferedReader(new FileReader("data/nations1.csv"));
            dataReader = new BufferedReader(new FileReader(filePath));

            // How to read file in java line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .setContinent(dataList.get(5))
                        .build();
                CountryFactory countryFactory = CountryFactory.getInstance();
                AbstractCountry abstractCountry = countryFactory.createCountry(dataList.get(5), newCountryData);
                countryListManager.append(abstractCountry);

                // Tạo đối tượng Country sử dụng CountryFactory,
                // sau đó cho vào CountryListManager để quản lý.
                
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
        List<String> result = new ArrayList<String>();
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

    public static void init() {
        String filePath = "D:\\Documents\\Senior-year\\Semester2\\OOP\\Final Exam K65\\src\\data\\countries2.csv";
        readListData(filePath);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testOriginalData() {
        String codes = CountryListManager.codeOfCountriesToString(CountryListManager.getInstance().getCountryList());
        System.out.print(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByPopulation() {
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByPopulation();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByPopulation() {
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByPopulation();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByArea() {
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByArea();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByArea() {
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByArea();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByGdp() {
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByGdp();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByGdp() {
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByGdp();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testFilterMostPopulousCountries() {
        List<AbstractCountry> countries = CountryListManager.getInstance().filterMostPopulousCountries(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testFilterLeastPopulousCountries() {
        List<AbstractCountry> countries = CountryListManager.getInstance().filterMostPopulousCountries(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterContinent() {
        List<AbstractCountry> countries = CountryListManager.getInstance().filterContinent("Asia");
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterLargestAreaCountries() {
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLargestAreaCountries(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterSmallestAreaCountries() {
        List<AbstractCountry> countries = CountryListManager.getInstance().filterSmallestAreaCountries(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterHighestGdpCountries() {
        List<AbstractCountry> countries = CountryListManager.getInstance().filterHighestGdpCountries(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterLowestGdpCountries() {
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLowestGdpCountries(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

}
