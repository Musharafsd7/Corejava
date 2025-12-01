package Homework3;

import java.util.Scanner;

public class BreakStopStockPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stock prices (-1 to stop):");

        while (true) {
            int price = sc.nextInt();
            if (price == -1) {
                System.out.println("Stop reading at -1");
                break;
            }
            System.out.println("Price: " + price);
        }
        sc.close();
    }
}
