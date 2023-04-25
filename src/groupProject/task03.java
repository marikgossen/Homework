package groupProject;

public class task03 {
    public static void main(String[] args) {

        int[][] values = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.print("The even numbers are: ");
        for (int[] value : values) {
            for (int i : value) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
