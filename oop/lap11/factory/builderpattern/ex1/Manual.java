package java_projects.src.hus.oop.lab11.builder_pattern.pseudocode;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        StringBuilder info = new StringBuilder("Information of car:\n");
        info.append("Type of car: ").append(carType).append('\n');
        info.append("Count of seats: ").append(seats).append('\n');
        info.append("Engine: volume - ").append(engine.getVolume())
                .append("; mileage - ").append(engine.getMileage()).append('\n');
        info.append("Transmission: ").append(transmission).append('\n');
        info.append("Trip Computer: ").append(this.tripComputer != null ? "Functional" : "N/A").append('\n');
        info.append("GPS Navigator: ").append(this.gpsNavigator != null ? "Functional" : "N/A").append('\n');
        return info.toString().trim();
    }
}
