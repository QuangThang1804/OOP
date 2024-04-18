package hus.oop.lap10.observerex2;

public class ObserverTestDrive {
    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        // Update the state of the subject
        subject.setState(10);
    }
}
