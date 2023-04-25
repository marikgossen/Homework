package groupProject;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();
        boolean isPrime=true;


        if(num>1){
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else{
            isPrime=false;
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not a prime number");
        }
    }
}
