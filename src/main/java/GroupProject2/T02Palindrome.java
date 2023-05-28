package GroupProject2;

import java.util.Scanner;

public class T02Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your input is expected on the next line:");
        String input = scan.nextLine();
        boolean output = isPalindrome(input);
        System.out.println(output);
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}