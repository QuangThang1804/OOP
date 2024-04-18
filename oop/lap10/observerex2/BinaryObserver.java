package hus.oop.lap10.observerex2;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int state = subject.getState();
        String binary = Integer.toBinaryString(state);
        System.out.println("Binary representation: " + binary);
    }
}
