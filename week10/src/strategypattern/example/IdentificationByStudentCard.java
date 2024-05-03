package strategypattern.example;

public class IdentificationByStudentCard implements Identification {
    @Override
    public String identify() {
        return "Please show your student card in front of the camera";
    }
}
