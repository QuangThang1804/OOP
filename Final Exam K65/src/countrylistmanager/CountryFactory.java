package countrylistmanager;

public class CountryFactory {
    public static CountryFactory instance;

    private CountryFactory() {

    }

    public static CountryFactory getInstance() {
        if (instance == null) {
            instance = new CountryFactory();
        }
        return instance;
    }

    public AbstractCountry createCountry(String type, CountryData data) {
        if (type.equals("Asia")) {
            return new AsiaCountry(data);
        } else if (type.equals("North America")) {
            /* TODO */
        } else if (type.equals("South America")) {
            /* TODO */
        } else if (type.equals("Oceania")) {
            /* TODO */
        } else if (type.equals("Africa")) {
            /* TODO */
        } else {
            /* TODO */
        }
    }
}
