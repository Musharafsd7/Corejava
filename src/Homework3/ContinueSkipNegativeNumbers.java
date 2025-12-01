package Homework3;

import java.util.Scanner;

public class ContinueSkipNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < 0) continue;
            System.out.println("Number: " + num);
        }
        sc.close();
    }
}
