package GroupProject2;

import java.util.Scanner;

public class T03NumOfWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string of words:");
        String input = scan.nextLine();
        int output = countWords(input);
        System.out.println(output);
    }

    public static int countWords(String s) {
        String[] words = s.split("\\s+");
        return words.length;
    }
}