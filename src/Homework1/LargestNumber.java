package Homework1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long a = sc.nextLong();
        System.out.print("Enter second number: ");
        long b = sc.nextLong();
        System.out.print("Enter third number: ");
        long c = sc.nextLong();

        long largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Largest number is: " + largest);
        sc.close();
    }
}
