package decorator.pseudocode;

public class App {
    public static void main(String[] args) {
        dumpUsedExample();
    }

    public static void dumpUsedExample() {
        DataSource source = new FileDataSource("somefile.dat");
        String salaryRecords = "Name, Salary\nMinh, 500$\nHelen, 200$";
        source.writeData(salaryRecords);

        source = new CompressionDecorator(source);
        source.writeData(salaryRecords);

        source = new EncryptionDecorator(source);
        source.writeData(salaryRecords);

    }
}
