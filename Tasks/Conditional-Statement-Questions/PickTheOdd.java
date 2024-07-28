/*
10. Pick the odd one out - Write a program to accept four numbers from user and print the odd one among them.

Number can be odd among others in following scenario:
if three numbers are equal, then the different one is odd one among them.
if three number are even, then the different one is odd one among them.
if three number are odd, then the different one is odd one among them.
if all are different, even or odd, then print no number is odd one among them.
*/

import java.util.Scanner;

public class PickTheOdd {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("Enter the third number: ");
        c = sc.nextInt();
        System.out.print("Enter the fourth number: ");
        d = sc.nextInt();
        if(a%2==b%2 && a%2==c%2 && b%2==c%2)
        {
            System.out.println(d+" one is odd one among them");
        }
        else if(a%2!=0 && b%2!=0 && c%2!=0)
        {
            System.out.println(" different one is odd one among them");
        }
        else if(!(a%2==b%2 && a%2==c%2 && b%2==c%2)){
            System.out.println("no number is odd one among them");
        }
        else if(a==b && a==c && b==c)
        {
            System.out.println("different one is odd one among them");
        }
        sc.close();
    }
}
