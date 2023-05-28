package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please input a number");
        int num1=scan.nextInt();

        while(num1!=-1){
            System.out.println("Please input a different number");
            num1=scan.nextInt();
        }
        System.out.println("Hello World");



    }




}
