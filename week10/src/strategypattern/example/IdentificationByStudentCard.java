package strategypattern.example;

public class IdentificationByStudentCard implements Identification {
    @Override
    public void identify() {
        System.out.println("Please show your student card in front of the camera");
    }
}
