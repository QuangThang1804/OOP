package singletonpattern.example;

public class Main {
    public static void main(String[] args) {
        HistorySubject historySubject = HistorySubject.getInstance();
        historySubject.changeTeacher("Minh", 30);

        HistorySubject historySubject1 = HistorySubject.getInstance();
    }
}
