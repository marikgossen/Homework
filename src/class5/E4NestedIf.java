package class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = "Sunday";
        int money = 90200;

        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");
            } else {
                System.out.println("Lets wait for sunday");
            }
        } else {
            System.out.println("Lets save more");

        }
    }
}
