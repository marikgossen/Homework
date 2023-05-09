package class12;

import org.w3c.dom.ls.LSOutput;

public class E8StringDemo {
    public static void main(String[] args) {


        String sentence = "Java is very easy";
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);


        String searchWord="Java";
        System.out.println(sentence.startsWith("java"));


    }
}