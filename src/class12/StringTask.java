package class12;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String username="Marikg";
        String password="pass1234";
        System.out.println("Enter the password:");
        String enteredPassword = input.next();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!enteredPassword.equals(password)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}