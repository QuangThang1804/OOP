package hus.oop.lap11.factory.bridgefactory.ex2;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}