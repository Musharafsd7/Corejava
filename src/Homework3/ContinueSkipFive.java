package Homework3;

public class ContinueSkipFive {
    public static void main(String[] args) {
        System.out.println("Print 1 to 10 (skip 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.print(i + " ");
        }
    }
}
