package Homework3;

import java.util.Scanner;

public class ContinueSkipInvalidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of emails: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            if (!email.contains("@")) continue;
            System.out.println("Valid email: " + email);
        }
        sc.close();
    }
}
