package strategypattern.example;

public class IdentificationByFace implements Identification {
    @Override
    public void identify() {
        System.out.println("Please stand in front of the camera");
    }
}
