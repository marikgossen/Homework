package GroupProject2;

public interface T06Shape {
    double calculateArea();

    double calculatePerimeter();
}

class Circle implements T06Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square implements T06Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class ShapeTester {
    public static void main(String[] args) {
        T06Shape circle = new Circle(4);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        T06Shape square = new Square(7);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}