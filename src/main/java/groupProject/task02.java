package groupProject;

public class task02 {
    public static void main(String[] args) {

        int[] values = {6, 5, 3, 1, 39, 11, 24};
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("The sum is: " + sum);
    }
}
