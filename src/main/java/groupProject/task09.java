package groupProject;

import java.util.Arrays;

public class task09 {
    public static void main(String[] args) {

        int[] numbers = {12, 43, 4, 17, -8, 11, 46, 243};
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.println("The second largest number in the array is: " + secondLargest);

        System.out.println("----------------------------");

       int num[] = {3, 2, 45, 6};
       Arrays.sort(num);
        System.out.println("The second largest number is "+num[num.length-2]);

    }
}
