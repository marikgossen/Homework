package class9;

public class HWTask7 {
    public static void main(String[] args) {

        int [] numbers= {4,-60,72,54,16};

        int largest=numbers[0];
        for (int num:numbers){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);







    }
}
