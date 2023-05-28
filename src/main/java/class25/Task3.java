package class25;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("Chicago");
        cities.add("Arlington Heights");
        cities.add("Huntley");
        cities.add("Algonquin");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}

