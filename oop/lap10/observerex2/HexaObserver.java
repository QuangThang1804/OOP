package hus.oop.lap10.observerex2;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int state = subject.getState();
        String hexa = Integer.toHexString(state);
        System.out.println("Hexadecimal representation: " + hexa);
    }
}
