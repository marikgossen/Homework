package class12;

public class CarTester {

    public static void main(String[] args) {

    Car actualCar=new Car();
    actualCar.brand="Lexus";
    actualCar.color="Black";
    actualCar.engine="3.5L V6";
    actualCar.mileage=100.003;
    actualCar.vehicleType="Sedan";
    actualCar.isAutomatic=true;
    actualCar.drive();
    actualCar.brake();
    actualCar.ignition();

    Car car=new Car();
    car.brand="Toyota";
    car.color="Silver";
    car.engine="3.5L V6";
    car.mileage=200.58;
    car.vehicleType="SUV";
    car.isAutomatic=true;
}
}
