package Homework3;

public class BreakStopLoop {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10 (break at 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i + " ");
        }
    }
}
