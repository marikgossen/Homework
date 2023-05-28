package class7;

import javax.management.MBeanAttributeInfo;

public class E11WhileLoop {

    public static void main(String[] args) {

        int counter = 100;

        while (counter <= 100) {
            if (counter % 2 != 0) {
                System.out.println(counter);
            }
            counter--;

        }
    }
}


