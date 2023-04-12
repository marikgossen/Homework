package class8;

public class E14NestedLoop {
    public static void main(String[] args) {


    for(int i=1; i<4; i++){
        System.out.println("1"+i);
    }
    for(int j=1; j<3; j++) {
        for (int i = 1; i < 4; i++) {
            System.out.println(j + " "+i);
        }

    }


}

    public static class HW1 {
        public static void main(String[] args) {


            for (int i = 1; i<=50; i++){
                if(i%3!=0){
                    System.out.println(i+" ");
                }
            }
        }
    }
}
