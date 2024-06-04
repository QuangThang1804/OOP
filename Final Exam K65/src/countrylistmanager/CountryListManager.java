package countrylistmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {

    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
    }

    public void remove(int index) {
        /* TODO */
    }

    public void remove(AbstractCountry country) {
        /* TODO */
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
    }

    public List<AbstractCountry> sortIncreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByArea() {
        /* TODO */
    }

    public List<AbstractCountry> sortDecreasingByArea() {
        /* TODO */
    }

    public List<AbstractCountry> sortIncreasingByGdp() {
        /* TODO */
    }

    public List<AbstractCountry> sortDecreasingByGdp() {
        /* TODO */
    }

    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
    }

    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
        /* TODO */
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
