package class4;

import java.util.Scanner;

public class HWDmv {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scan.nextInt();
        if (age>=18){
            System.out.println("You may take the driver exam");
        }else{
            System.out.println("Im sorry but you're only "+age+", you may take the learners permit instead");
        }
    }
}
