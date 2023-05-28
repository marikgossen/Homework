package MyProjects;

import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {

        Random randNumber = new Random();

        int x = randNumber.nextInt(99) +1;
        if( x < 50 ){
            System.out.println("Hold this L, you rolled"+" "+x);
        }else{
            System.out.println("Ez Dubz, you rolled"+" "+x);
        }



    }
}
