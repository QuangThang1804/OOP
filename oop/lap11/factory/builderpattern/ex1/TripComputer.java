package java_projects.src.hus.oop.lab11.builder_pattern.pseudocode;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started.");
        } else {
            System.out.println("Car isn't started.");
        }
    }
}
