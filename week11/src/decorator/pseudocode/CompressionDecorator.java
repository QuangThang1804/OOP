package decorator.pseudocode;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource s) {
        super(s);
    }

    @Override
    public void writeData(String data) {
        String compressData = " compress" + data;
        super.writeData(compressData);
    }

    @Override
    public String readData() {
        String getData = super.readData();
        return " decrypt data " + getData;
    }
}
