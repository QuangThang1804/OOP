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
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        this.countryList.add(country);
    }

    public void add(AbstractCountry country, int index) {
        this.countryList.add(index, country);
    }

    public void remove(int index) {
        this.countryList.remove(index);
    }

    public void remove(AbstractCountry country) {
        this.countryList.remove(country);
    }

    public AbstractCountry countryAt(int index) {
        return this.countryList.get(index);
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
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (right.getArea() - left.getArea() == 0) {
                    return 0;
                }
                return (int) (left.getArea() - right.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByArea() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (right.getArea() - left.getArea() == 0) {
                    return 0;
                }
                return (int) (right.getArea() - left.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByGdp() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (right.getGdp() - left.getGdp() == 0) {
                    return 0;
                }
                return (int) (- right.getGdp() + left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByGdp() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (right.getGdp() - left.getGdp() == 0) {
                    return 0;
                }
                return (int) (right.getGdp() - left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        List<AbstractCountry> newList = new LinkedList<>();
        for (AbstractCountry abstractCountry: this.countryList) {
            if (abstractCountry.getContinent().equals(continent)) {
                newList.add(abstractCountry);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>();
        List<AbstractCountry> listSort = sortDecreasingByPopulation();

        for (int i = 0; i < howMany; i++) {
            newList.add(listSort.get(i));
        }
        return newList;
    }

    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>();
        List<AbstractCountry> listSort = sortIncreasingByPopulation();

        for (int i = 0; i < howMany; i++) {
            newList.add(listSort.get(i));
        }
        return newList;
    }

    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>();
        List<AbstractCountry> listSort = sortDecreasingByArea();

        for (int i = 0; i < howMany; i++) {
            newList.add(listSort.get(i));
        }
        return newList;
    }

    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>();
        List<AbstractCountry> listSort = sortIncreasingByArea();

        for (int i = 0; i < howMany; i++) {
            newList.add(listSort.get(i));
        }
        return newList;
    }

    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>();
        List<AbstractCountry> listSort = sortDecreasingByGdp();

        for (int i = 0; i < howMany; i++) {
            newList.add(listSort.get(i));
        }
        return newList;
    }

    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>();
        List<AbstractCountry> listSort = sortIncreasingByGdp();

        for (int i = 0; i < howMany; i++) {
            newList.add(listSort.get(i));
        }
        return newList;
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
