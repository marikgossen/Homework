package class3;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 10;

        if (num > 0) {
            System.out.println(num + " " + "is a positive number");
        } else {
            System.out.println(num + " " + "is a negative number");
        }


        if (num % 2 == 0) {
            System.out.println(num + " " + "is an even number");
        } else {
            System.out.println(num + " " + "is an odd number");
        }

    }
}