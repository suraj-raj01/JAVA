/*
1. Write a program to sum all the entered value until user enter 0 to stop.
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x;
        while (true) {
            System.out.println("Enter the value: ");
            int a = sc.nextInt();
            sum += a;
            System.out.println("Enter 1 for continue & 0 for stop: ");
            x = sc.nextInt();
            if (x == 1) {
                continue;
            }
            break;
        }
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
