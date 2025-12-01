package Homework3;

import java.util.Scanner;

public class ATMSwitchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            int option = sc.nextInt();

            switch(option) {
                case 1 -> System.out.println("Your balance is 5000");
                case 2 -> System.out.println("Deposit successful");
                case 3 -> System.out.println("Withdraw successful");
                case 4 -> {
                    System.out.println("Exit… Thank You!");
                    break;
                }
                default -> System.out.println("Invalid option");
            }
            if (option == 4) break;
        }
        sc.close();
    }
}
