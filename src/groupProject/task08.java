package groupProject;

public class task08 {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 8, 4, 9};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The maximum number in the array is: " + max);
        System.out.println("The minimum number in the array is: " + min);
    }
}
