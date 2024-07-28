/*
3. Write a program to accept three numbers from user and print equals if the numbers are equal.
*/

import java.util.Scanner;

public class CheckEquals {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
        if(a==b && a==c && b==c)
        {
            System.out.println("All numbers are equal!!!");
        }
        sc.close();
    }
}
