package class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Nick");
        names.add("Ivan");
        names.add("Daniel");
        names.add("Sarah");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Sarah"));
        System.out.println(names.size());
    }
}