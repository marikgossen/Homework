package class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> car=new ArrayList<>();
        car.add("Lexus");
        car.add("Toyota");
        car.add("Acura");

        System.out.println(car);
        for (int i = 0; i < car.size(); i++) {
            String word=car.get(i);
            if(word.endsWith("a")){
                car.remove(i);
                i--;
            }
        }
        System.out.println(car);
    }
}
