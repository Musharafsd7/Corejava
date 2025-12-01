package Homework1;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((b != 0) ? (a / b) : "Cannot divide by zero"));
        System.out.println("Modulo: " + ((b != 0) ? (a % b) : "Cannot modulo by zero"));
        sc.close();
    }
}
