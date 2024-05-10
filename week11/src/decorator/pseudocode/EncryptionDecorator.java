package decorator.pseudocode;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource s) {
        super(s);
    }

    @Override
    public void writeData(String data) {
        String encryptData = "encrypt" + data;
        this.writeData(encryptData);
    }

    @Override
    public String readData() {
        String getData = this.readData();
        return "decrypt data " + getData;
    }
}
