package Homework5;

public class CollegeStudent {
    static String collegeName;
    String name;
    int rollno;

    CollegeStudent(String n, int r) {
        name = n;
        rollno = r;
    }

    static void changeCollege(String c) {
        collegeName = c;
    }

    public static void main(String[] args) {
        CollegeStudent.changeCollege("IIT Delhi");

        CollegeStudent s = new CollegeStudent("Zara", 12);

        System.out.println("College Name: " + collegeName);
        System.out.println("Student: " + s.name);
        System.out.println("Roll No: " + s.rollno);
    }
}
