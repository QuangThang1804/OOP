package singletonpattern.database;

public class Database {
    private static Database instance;
    private boolean isThreadLock;
    private String url;
    private String user;
    private String pass;
    private Database() {
        this.url = "jdbc:oracle:thin:@localhost:1521:xe";
        this.user = "system";
        this.pass = "12345";
        this.isThreadLock = false;
    }

    public static Database getInstance() {
        instance.acquireThreadLock();
        if (instance == null) {
            System.out.println("Create unique instance of Database");
            return instance = new Database();
        }
        System.out.println("Returning instance of Database");
        return instance;
    }

    public void acquireThreadLock() {
        if (!this.isThreadLock) {
            this.isThreadLock = true;
        }
    }

    public String query(String sql) {
        return sql;
    }
}
