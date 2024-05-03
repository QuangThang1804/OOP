package strategypattern.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student1 = new Student("Minh", 10);
        System.out.println("Please, select a identification method");
        String actionIdentification = in.nextLine();
        if (actionIdentification.equals("face")) {
            student1.setIdentification(new IdentificationByFace());
        }
        if (actionIdentification.equals("card")) {
            student1.setIdentification(new IdentificationByStudentCard());
        }
        student1.identify();
    }
}
