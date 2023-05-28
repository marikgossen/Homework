package class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean chocolates = true;
        boolean flowers = false;

        if (chocolates || flowers) {
            System.out.println("I am happy");
        } else {
            System.out.println("I am sad");
        }

        boolean fiveG=true ;
        boolean wifi=false;

        if(fiveG || wifi) {
            System.out.println("You are connected");
        } else {
            System.out.println("You are not connected to the internet");
        }

    }
}
