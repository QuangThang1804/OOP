package decorator.pseudocode;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource s) {
        super(s);
    }

    @Override
    public void writeData(String data) {
        String encryptData = " encrypt" + data;
        super.writeData(encryptData);
    }

    @Override
    public String readData() {
        String getData = super.readData();
        return " decrypt data " + getData;
    }
}
