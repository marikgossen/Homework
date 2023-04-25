package groupProject;

public class task04 {
    public static void main(String[] args) {

        int[][] array={{12,-14,53,64}, {43,25,3},{86,1},{53,62,77,12}};

        int sumOdd=0;
        int sumEven=0;
        int number;


        for (int r=0; r<array.length; r++) {
            for (int c = 0; c<array[r].length ; c++) {

                number=array[r][c];
                if(number%2==0){
                    sumEven+=number;
                } else {
                    sumOdd+=number;
                }

            }
        }
        System.out.println("Sum of even: "+sumEven);
        System.out.println("Sum of even: "+sumOdd);
    }
}
