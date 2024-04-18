package java_projects.src.hus.oop.lab11.builder_pattern.pseudocode;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder carBuilder = new CarBuilder();
        director.makeSUVCar(carBuilder);

        Car suvCar = ((CarBuilder) carBuilder).getResult();
        System.out.println("Car built:\n" + suvCar.getCarType());

        Builder manualBuilder = new ManualBuilder();
        director.makeSUVCar(manualBuilder);

        Manual suvManual = ((ManualBuilder) manualBuilder).getResult();
        System.out.println("\nCar manual built:\n" + suvManual.print());

        carBuilder = carBuilder.reset();
        manualBuilder = manualBuilder.reset();

        director.makeSportsCar(carBuilder);
        Car sportsCar = ((CarBuilder) carBuilder).getResult();
        System.out.println("Car built:\n" + sportsCar.getCarType());

        director.makeSportsCar(manualBuilder);

        Manual sportsManual = ((ManualBuilder) manualBuilder).getResult();
        System.out.println("\nCar manual built:\n" + sportsManual.print());
    }
}
