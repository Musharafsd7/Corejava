package Homework3;

public class SwitchContinueOddNumbers {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 10 with words:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue; // skip even numbers

            switch(i) {
                case 1 -> System.out.println("1 → ONE");
                case 3 -> System.out.println("3 → THREE");
                case 5, 7, 9 -> System.out.println(i + " → ODD NUMBER");
                default -> System.out.println(i);
            }
        }
    }
}
