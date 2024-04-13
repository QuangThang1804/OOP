package countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        System.out.println("\nTest filter Africa Country");
        testFilterAfricaCountry();
        System.out.println("\nTest filter Asia Country");
        testFilterAsiaCountry();
        System.out.println("\nTest filter Europe Country");
        testFilterEuropeCountry();
        System.out.println("\nTest filter North America Country");
        testFilterNorthAmericaCountry();
        System.out.println("\nTest filter Oceania Country");
        testFilterOceaniaCountry();
        System.out.println("\nTest filter South America Country");
        testFilterSouthAmericaCountry();
        System.out.println("\nTest filter Highest Gdp Country");
        testFilterHighestGdpCountries();
        System.out.println("\nTest filter Largest Area Country");
        testFilterLargestAreaCountries();
        System.out.println("\nTest filter Most Populous Country");
        testFilterMostPopulousCountries();
        System.out.println("\nTest filter Lowest Gdp Country");
        testFilterLowestGdpCountries();
        System.out.println("\nTest filter Smallest Area Country");
        testFilterSmallestAreaCountries();
        System.out.println("\nTest filter Least Populous Country");
        testFilterLeastPopulousCountries();
        System.out.println("\nTest sort Decreasing By Area");
        testSortDecreasingByArea();
        System.out.println("\nTest sort Decreasing By Gdp");
        testSortDecreasingByGdp();
        System.out.println("\nTest sort Decreasing By Population");
        testSortDecreasingByPopulation();
        System.out.println("\nTest sort Increasing By Area");
        testSortIncreasingByArea();
        System.out.println("\nTest sort Increasing By Gdp");
        testSortIncreasingByGdp();
        System.out.println("\nTest sort Increasing By Population");
        testSortIncreasingByPopulation();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                Country[] countries;
                switch (dataList.get(5)) {
                    case "Oceania":
                        Country oceniaCountry = new OceaniaCountry(
                                dataList.get(0), dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        countryManager.append(oceniaCountry);
                        break;
                    case "Asia":
                        Country asiaCountry = new AsiaCountry(
                                dataList.get(0), dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        countryManager.append(asiaCountry);
                        break;
                    case "Europe":
                        Country europeCountry = new EuropeCountry(
                                dataList.get(0), dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        countryManager.append(europeCountry);
                        break;
                    case "North America":
                        Country northAmericaCountry = new NorthAmericaCountry(
                                dataList.get(0), dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        countryManager.append(northAmericaCountry);
                        break;
                    case "South America":
                        Country southAmericaCountry = new SouthAmericaCountry(
                                dataList.get(0), dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        countryManager.append(southAmericaCountry);
                        break;
                    case "Africa":
                        Country africaCountry = new AfricaCountry(
                                dataList.get(0), dataList.get(1),
                                Integer.parseInt(dataList.get(2)),
                                Double.parseDouble(dataList.get(3)),
                                Double.parseDouble(dataList.get(4)));
                        countryManager.append(africaCountry);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
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

    public static void init() {
        String filePath = "week8/src/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        CountryArrayManager.print(countries);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        CountryArrayManager.print(countries);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        CountryArrayManager.print(countries);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        CountryArrayManager.print(countries);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        CountryArrayManager.print(countries);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        CountryArrayManager.print(countries);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        CountryArrayManager.print(countries);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        CountryArrayManager.print(countries);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        CountryArrayManager.print(countries);
    }
}
