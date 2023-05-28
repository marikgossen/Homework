package class12;

public class Car {

    String brand;
    String color;
    String engine;
    double mileage;
    String vehicleType;
    boolean isAutomatic;

    void drive() {
        System.out.println("Pressing accelerator.....");
    }
    void brake(){
        System.out.println("Braking....");
    }
    void ignition(){
        System.out.println("Turning key and starting car....");
    }
}