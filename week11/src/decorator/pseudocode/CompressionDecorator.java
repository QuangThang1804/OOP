package decorator.pseudocode;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource s) {
        super(s);
    }

    @Override
    public void writeData(String data) {
        String compressData = "compress" + data;
        this.
        this.writeData(compressData);
    }

    @Override
    public String readData() {
        String getData = this.readData();
        return "decrypt data " + getData;
    }
}
