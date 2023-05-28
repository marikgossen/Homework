package class9;

public class E11Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[2]=50;
        numbers [0]=20;
        numbers[1]=30;
        numbers[3]=40;
        numbers[4]=10;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);

        }
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
