package decorator.pseudocode;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource s) {
        this.wrappee = s;
    }

    @Override
    public void writeData(String data) {
        this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return this.wrappee.readData();
    }
}
