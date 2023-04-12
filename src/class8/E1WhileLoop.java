package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please print starting variable");
        int start=scan.nextInt();
        System.out.println("Please print ending variable");
        int end=scan.nextInt();

        while(start<=end){
            System.out.println(start);
            start++;
        }



    }
}
