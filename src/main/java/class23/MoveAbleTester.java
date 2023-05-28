package class23;

import java.util.ArrayList;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble=new Cat();
        MoveAble[] moveAbles={new Cat(),new Dog()};

        for (MoveAble m : moveAbles) {
            m.move();
        }
    }

    public static class E2Collections {
        public static void main(String[] args) {
            ArrayList<String> names= new ArrayList<>();
        }
    }
}
