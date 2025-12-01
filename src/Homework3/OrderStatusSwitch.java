package Homework3;

import java.util.Scanner;

public class OrderStatusSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order status: ");
        String status = sc.next();

        switch(status.toUpperCase()) {
            case "PENDING" -> System.out.println("Order is pending");
            case "SHIPPED" -> System.out.println("Your order is on the way");
            case "DELIVERED" -> System.out.println("Order delivered successfully");
            case "CANCELLED" -> System.out.println("Order cancelled");
            default -> System.out.println("Invalid status");
        }
        sc.close();
    }
}
