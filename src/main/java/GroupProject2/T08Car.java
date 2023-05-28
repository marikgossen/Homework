package GroupProject2;

public class T08Car {
    public static void main(String[] args) {
        Car sedan = new Sedan(25000, "grey", 18);
        System.out.println("This " + sedan.color + " sedan's price is $" + sedan.calculateSalePrice());

        Car truck = new Truck(80000, "maroon", 3750);
        System.out.println("This " + truck.color + " truck's price is $" + truck.calculateSalePrice());
    }
}

class Car {
    protected double price;
    protected String color;

    public Car(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double calculateSalePrice() {
        return price;
    }
}

class Sedan extends Car {
    private int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return price * 0.95;
        } else {
            return price * 0.9;
        }
    }
}

class Truck extends Car {
    private int weight;

    public Truck(double price, String color, int weight) {
        super(price, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return price * 0.9;
        } else {
            return price * 0.8;
        }
    }
}