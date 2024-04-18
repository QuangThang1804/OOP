package hus.oop.lap10.observerex2;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int state = subject.getState();
        String octal = Integer.toOctalString(state);
        System.out.println("Octal representation: " + octal);
    }
}
