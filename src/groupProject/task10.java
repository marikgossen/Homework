package groupProject;

public class task10 {
    public static void main(String[] args) {


        String[] names = {"Ivan", "Mark", "Daniel", "Serghei", "Ivan", "Mark", "Daniel", "Serghei"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                }
            }
        }
    }
}
