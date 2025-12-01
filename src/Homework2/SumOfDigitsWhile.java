package Homework2;

import java.util.Scanner;

public class SumOfDigitsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long sum = 0;

        long temp = Math.abs(num); // handle negative numbers
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
