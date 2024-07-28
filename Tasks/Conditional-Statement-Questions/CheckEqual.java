/*
2. Write a program that accept two numbers from the user and print equals if the numbers are equal.
 */

import java.util.Scanner;

public class CheckEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("Numbers are equal!!!!");
        }
        sc.close();
    }
}
