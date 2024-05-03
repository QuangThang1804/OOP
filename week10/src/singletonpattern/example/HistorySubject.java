package singletonpattern.example;

public class HistorySubject {
    private static HistorySubject uniqueInstance;
    private String name;
    private int age;

    private HistorySubject() {
        this.name = "Huong";
        this.age = 40;
    }

    public static HistorySubject getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Create new object");
            return uniqueInstance = new HistorySubject();
        }
        System.out.println("Returning instance of HistorySubject");
        return uniqueInstance;
    }

    public void changeTeacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
