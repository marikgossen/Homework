package class4;

import java.util.Scanner;

public class HWTempConversion {
    public static void main(String[] args) {

        System.out.println("Please enter your city name");
        Scanner scan = new Scanner(System.in);
        String city = scan.next();

        System.out.println("Please enter you're city temp in Fahrenheit");
        int temp = scan.nextInt();

        double celcius = (temp - 32) * (0.5556);
        System.out.println("The temperature in " + city + " is " + celcius + " celcius");


    }
}
