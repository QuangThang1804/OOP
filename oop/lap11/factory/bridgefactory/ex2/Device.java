package hus.oop.lap11.factory.bridgefactory.ex2;

public interface Device { nh
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
