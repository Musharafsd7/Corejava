package Homework2;

import java.util.Scanner;

public class EnterNumbersUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;

        do {
            System.out.print("Enter a number (0 to exit): ");
            num = sc.nextLong();
            if (num != 0) {
                System.out.println("You entered: " + num);
            }
        } while (num != 0);

        System.out.println("Program exited.");
        sc.close();
    }
}
