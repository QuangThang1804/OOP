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

//        String salaryRecords = "Name, Salary\nJohn Smith, 100000\nSteven Jobs, 912000";
//        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));
//
//        encoded.writeData(salaryRecords);
//        DataSource plain = new FileDataSource("out/OutputDemo.txt");
//        System.out.println("- Input ----------------");
//        System.out.println(salaryRecords);
//        System.out.println("- Encoded --------------");
//        System.out.println(plain.readData());
//        System.out.println("- Decoded --------------");
//        System.out.println(encoded.readData());
    }
}
