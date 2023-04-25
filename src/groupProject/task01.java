package groupProject;

public class task01 {
    public static void main(String[] args) {

        int[] temperatures = {75, 56, 47, 85, 93, 53, 72};
        int highestTemp = temperatures[0];
        int lowestTemp = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemp) {
                highestTemp = temperatures[i];
            }
            if (temperatures[i] < lowestTemp) {
                lowestTemp = temperatures[i];
            }
        }

        System.out.println("The highest temperature this week was " + highestTemp);
        System.out.println("The lowest temperature for the week is: " + lowestTemp);
    }
}
