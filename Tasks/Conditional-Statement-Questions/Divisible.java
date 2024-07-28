/*
4. Write a program to accept three numbers from user and print all are divisible by 9, if all three numbers are divisible by 9.
*/

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
        if(a%9==0 && b%9==0 && c%9==0)
        {
            System.out.println("All number are divisible by 9");
        }
        sc.close();
    }
}
