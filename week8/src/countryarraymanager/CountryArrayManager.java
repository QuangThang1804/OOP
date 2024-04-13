package countryarraymanager;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        Country temp;
        int minIdx;
        for (int i = 0; i < newArray.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[minIdx].getPopulation() > newArray[j].getPopulation()) {
                    minIdx = j;
                }
            }
            temp = newArray[i];
            newArray[i] = newArray[minIdx];
            newArray[minIdx] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        Country temp;
        int maxIdx;
        for (int i = 0; i < newArray.length - 1; i++) {
            maxIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[maxIdx].getPopulation() < newArray[j].getPopulation()) {
                    maxIdx = j;
                }
            }
            temp = newArray[i];
            newArray[i] = newArray[maxIdx];
            newArray[maxIdx] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        int n = newArray.length;
        boolean swapped;
        Country temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (newArray[i - 1].getArea() > newArray[i].getArea()) {
                    temp = newArray[i - 1];
                    newArray[i - 1] = newArray[i];
                    newArray[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        int n = newArray.length;
        boolean swapped;
        Country temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (newArray[i - 1].getArea() < newArray[i].getArea()) {
                    temp = newArray[i - 1];
                    newArray[i - 1] = newArray[i];
                    newArray[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        Country key;
        for (int idx = 1; idx < newArray.length; idx++) {
            key = newArray[idx];
            int j = idx - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        Country key;
        for (int idx = 1; idx < newArray.length; idx++) {
            key = newArray[idx];
            int j = idx - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        Country[] newArray = new Country[this.length];
        int idxNewArr = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AfricaCountry) {
                newArray[idxNewArr] = this.countries[i];
                idxNewArr++;
            }
        }
        AfricaCountry[] africaCountries = new AfricaCountry[idxNewArr + 1];
        for (int i = 0; i < idxNewArr; i++) {
            africaCountries[i] = (AfricaCountry) newArray[i];
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        Country[] newArray = new Country[this.length];
        int idxNewArr = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AsiaCountry) {
                newArray[idxNewArr] = this.countries[i];
                idxNewArr++;
            }
        }
        AsiaCountry[] asiaCountries = new AsiaCountry[idxNewArr + 1];
        for (int i = 0; i < idxNewArr; i++) {
            asiaCountries[i] = (AsiaCountry) newArray[i];
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        Country[] newArray = new Country[this.length];
        int idxNewArr = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof EuropeCountry) {
                newArray[idxNewArr] = this.countries[i];
                idxNewArr++;
            }
        }
        EuropeCountry[] europeCountries = new EuropeCountry[idxNewArr + 1];
        for (int i = 0; i < idxNewArr; i++) {
            europeCountries[i] = (EuropeCountry) newArray[i];
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        Country[] newArray = new Country[this.length];
        int idxNewArr = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof NorthAmericaCountry) {
                newArray[idxNewArr] = this.countries[i];
                idxNewArr++;
            }
        }
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[idxNewArr + 1];
        for (int i = 0; i < idxNewArr; i++) {
            northAmericaCountries[i] = (NorthAmericaCountry) newArray[i];
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        Country[] newArray = new Country[this.length];
        int idxNewArr = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof OceaniaCountry) {
                newArray[idxNewArr] = this.countries[i];
                idxNewArr++;
            }
        }
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[idxNewArr + 1];
        for (int i = 0; i < idxNewArr; i++) {
            oceaniaCountries[i] = (OceaniaCountry) newArray[i];
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        Country[] newArray = new Country[this.length];
        int idxNewArr = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                newArray[idxNewArr] = this.countries[i];
                idxNewArr++;
            }
        }
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[idxNewArr + 1];
        for (int i = 0; i < idxNewArr; i++) {
            southAmericaCountries[i] = (SouthAmericaCountry) newArray[i];
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] filterCountries = sortByDecreasingPopulation();
        Country[] mostPopulousCountries = new Country[howMany];
        for (int i = 0; i < mostPopulousCountries.length; i++) {
            mostPopulousCountries[i] = filterCountries[i];
        }
        return mostPopulousCountries;

    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] filterCountries = sortByIncreasingPopulation();
        Country[] leastPopulousCountries = new Country[howMany];
        for (int i = 0; i < leastPopulousCountries.length; i++) {
            leastPopulousCountries[i] = filterCountries[i];
        }
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] filterCountries = sortByDecreasingArea();
        Country[] largestAreaCountries = new Country[howMany];
        for (int i = 0; i < largestAreaCountries.length; i++) {
            largestAreaCountries[i] = filterCountries[i];
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] filterCountries = sortByIncreasingArea();
        Country[] smallestAreaCountries = new Country[howMany];
        for (int i = 0; i < smallestAreaCountries.length; i++) {
            smallestAreaCountries[i] = filterCountries[i];
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] filterCountries = sortByDecreasingGdp();
        Country[] highestGdpCountries = new Country[howMany];
        for (int i = 0; i < highestGdpCountries.length; i++) {
            highestGdpCountries[i] = filterCountries[i];
        }
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] filterCountries = sortByIncreasingGdp();
        Country[] lowestGdpCountries = new Country[howMany];
        for (int i = 0; i < lowestGdpCountries.length; i++) {
            lowestGdpCountries[i] = filterCountries[i];
        }
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
