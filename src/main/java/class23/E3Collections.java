package class23;

import java.util.ArrayList;

public class E3Collections {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Axel");
        names.add("Adam");
        names.add("Marina");
        names.add("Farwa");

        names.remove(0);
        System.out.println(names);


    }
}
