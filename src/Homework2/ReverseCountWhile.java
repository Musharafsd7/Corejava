package Homework2;

import java.util.Scanner;

public class ReverseCountWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to start reverse count: ");
        int start = sc.nextInt();

        System.out.println("Counting down from " + start + " to 1:");
        while (start >= 1) {
            System.out.println(start);
            start--;
        }
        sc.close();
    }
}
