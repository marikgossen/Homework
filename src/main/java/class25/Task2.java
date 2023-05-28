package class25;

import java.util.TreeSet;

/*
Create a Set in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
 */
public class Task2 {
    public static void main(String[] args) {

    TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Spain");
        countries.add("Nigeria");
        countries.add("Pakistan");
        countries.add("Guatemala");
        countries.add("Mexico");
        countries.add("England");
        countries.add("China");
        countries.add("Japan");
        countries.add("India");

        System.out.println(countries);

        for(
    String c:countries)

    {
        System.out.print(c + " ");
    }
}
}