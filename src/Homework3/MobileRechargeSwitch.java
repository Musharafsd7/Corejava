package Homework3;

import java.util.Scanner;

public class MobileRechargeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Mobile Recharge Menu ---");
        System.out.println("1. Data Pack");
        System.out.println("2. SMS Pack");
        System.out.println("3. Talktime");

        System.out.print("Choose option (1-3): ");
        int option = sc.nextInt();

        switch(option) {
            case 1 -> System.out.println("Data Pack Selected");
            case 2 -> System.out.println("SMS Pack Selected");
            case 3 -> System.out.println("Talktime Selected");
            default -> System.out.println("Invalid option");
        }

        sc.close();
    }
}
