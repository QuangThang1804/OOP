package java_projects.src.hus.oop.lab11.builder_pattern.pseudocode;

public interface Builder {
    Builder reset();
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
}
