package singletonpattern.database;

public class Application {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        System.out.println(database.query("SELECT name from student"));

        Database bar = Database.getInstance();
        System.out.println(database.query("SELECT score from student"));
    }
}
