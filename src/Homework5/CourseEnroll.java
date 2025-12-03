package Homework5;

public class CourseEnroll {
    static String platform = "Udemy";
    String studentName;
    String courseName;
    int fee;

    CourseEnroll(String s) {
        studentName = s;
    }

    CourseEnroll(String c, int f) {
        courseName = c;
        fee = f;
    }

    static void changePlatform(String p) {
        platform = p;
    }

    public static void main(String[] args) {
        CourseEnroll s = new CourseEnroll("Akila");
        CourseEnroll c = new CourseEnroll("Java", 15000);

        System.out.println(s.studentName + " Enrolled");
        System.out.println("Course: " + c.courseName);
        System.out.println("Fee: " + c.fee);
        System.out.println("Platform: " + platform);
    }
}
