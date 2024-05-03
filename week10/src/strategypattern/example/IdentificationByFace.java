package strategypattern.example;

public class IdentificationByFace implements Identification {
    @Override
    public String identify() {
        return "Please stand in front of the camera";
    }
}
