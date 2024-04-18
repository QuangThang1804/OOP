package java_projects.src.hus.oop.lab11.builder_pattern.pseudocode;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private GPSNavigator gpsNavigator;
    private Transmission transmission;
    private TripComputer tripComputer;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public Builder reset() {
        return new CarBuilder();
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
