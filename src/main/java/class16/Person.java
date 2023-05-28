package class16;

public class Person {
    private String password;
    static double bankBalance=12000;
    private static void printPassword() {
   //     System.out.println(password);
    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword();
        System.out.println(Person.bankBalance);
    }
}
