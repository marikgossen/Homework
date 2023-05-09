package class15;

import java.util.Arrays;

public class E1 {
    //create a method that takes a number as an input and creates an array of
    // ints with the size give by that number fill the array with
    // some numbers lets say 10 and returns the array call the method createArray
    int [] createArray(int size){
        int[] arr=new int [size];
        for (int i = 0; i < size; i++) {
            arr[i]=10;
        }
    return arr;
    }

    public static void main(String[] args) {

        E1 e1=new E1();
        int[] array = e1.createArray(5);
        System.out.println(Arrays.toString(array));
    }
}
