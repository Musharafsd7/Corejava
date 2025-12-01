package Homework4;

class Student {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class StudentDetailsMethod {
    public static void main(String[] args) {
        Student s1 = new Student("Ahamed", 22, "B.Tech");
        printStudentDetails(s1);
    }

    public static void printStudentDetails(Student student) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Course: " + student.course);
    }
}
