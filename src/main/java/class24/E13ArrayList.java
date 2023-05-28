package class24;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class E13ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("smoothie");
        drinks.add("ginger ale");
        drinks.add("chai");
        drinks.add("milk");
        drinks.replaceAll(a -> a.contains("a") || a.contains("e")? "water" :a);
        System.out.println(drinks);
    }
}
