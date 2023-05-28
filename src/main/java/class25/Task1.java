package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
How can you remove all duplicates from ArrayList?

 */
public class Task1 {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> hashSet=new LinkedHashSet<>(aList);
        System.out.println(hashSet);
    }
}
