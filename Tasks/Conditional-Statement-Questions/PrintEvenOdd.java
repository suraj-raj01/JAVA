/*
6. Write a program to accept an integer from user and print even if the number is even, Otherwise print odd.
*/

import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even Number!!");
        }
        else{
            System.out.println("Odd Number!!");
        }
        sc.close();
    }
}

/*
Enter the number: 
12
Even Number!!
-------------------------
Enter the number: 
13
Odd Number!!
*/