package class13;

public class Task2 {
    public static void main(String[] args) {
        String str = "I love %%% sushi";
        String str1=str.replaceAll("[a-zA-Z]","");
        System.out.println(str1);
    }
}
