package decorator.pseudocode;

public class FileDataSource implements DataSource {
    private String fileName;
    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("write data to file " + this.fileName + data);
    }

    @Override
    public String readData() {
        return "Read data from file " + this.fileName;
    }
}
