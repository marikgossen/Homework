package class14;

import java.util.Scanner;

public class E2ArrayManipulator {

    int sumArr(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }


        return sum;
    }

    public static void main(String[] args) {
        E2ArrayManipulator obj=new E2ArrayManipulator();
        int [] array={10, 20, 30};
        int result=obj.sumArr(array);
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();

    }


}
