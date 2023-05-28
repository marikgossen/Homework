package class18HW;

public class TeacherTester {
        public static void main(String[] args) {
            Teacher teacher = new Teacher();
            teacher.subject="Substitute";
            teacher.name="Henry";
            teacher.age=34;
            System.out.println(teacher.name+" is "+teacher.age+" years old. and is a "+teacher.subject+" teacher.");
            teacher.board();
            System.out.println("-------------------------------------------------------");

            MathTeacher mt = new MathTeacher();
            mt.subject ="Math";
            mt.name="John";
            mt.age =43;
            System.out.println(mt.name+" is "+mt.age+" years old, and is a "+mt.subject+" teacher.");
            System.out.println("-------------------------------------------------------");

            ChemistryTeacher ct = new ChemistryTeacher();
            ct.subject ="Chemistry";
            ct.name="Rick";
            ct.age=53;
            System.out.println(ct.name+" is "+ct.age+" years old. and is a "+ct.subject+" teacher.");
            ct.grading();
            System.out.println("-------------------------------------------------------");

            PianoTeacher pt = new PianoTeacher();
            pt.checksAttendance();
            pt.givingHomework();


        }

    }
