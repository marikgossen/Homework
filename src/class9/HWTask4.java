package class9;

public class HWTask4 {
    public static void main(String[] args) {
        String[] cars = {"Toyota", "BMW", "Honda", "Bugatti", "Audi", "Mercedes"};
        for (String car : cars) {
            System.out.print(car + "  ");
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + "  ");
        }
        System.out.println();
        int i = 0;
        while (i < cars.length) {
            System.out.print(cars[i] + "  ");
            i++;
        }
    }
}
