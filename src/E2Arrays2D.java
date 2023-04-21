package class11;

public class E2Arrays2D {
    public static void main(String[] args) {

        String[][] names = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"},
        };
        for(String[]nameArr:names){
            for(String name:nameArr){
                System.out.println(name);
            }
            System.out.println();
        }



    }
}
