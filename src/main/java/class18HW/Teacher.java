package class18HW;

public class Teacher {
    String name;
    String subject;
    int age;

    void board(){
        System.out.println("Teacher is writing an explanation on the board.");
    }
    void grading(){
        System.out.println("Teacher "+name+" is grading the turned in assignments from "+ subject+" class.");
    }
    void givingHomework(){
        System.out.println("Teacher is giving out homework that's due next class.");
    }
    void checksAttendance(){
        System.out.println("Teacher is checking the attendance.");
    }
}

