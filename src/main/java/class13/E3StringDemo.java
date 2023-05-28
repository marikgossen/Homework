package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="ewfgwiuFEOWEOF456789#$%^&*";

        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));



    }
}
