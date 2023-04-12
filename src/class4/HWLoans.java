package class4;

import java.util.Scanner;

public class HWLoans {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How much would you like to loan?");
        int loan=scan.nextInt();
        if (loan<=200000){
            System.out.println("Your request has been accepted");
        }else{
            System.out.println("I'm sorry, but we cannot loan you this money");
        }
    }
}
