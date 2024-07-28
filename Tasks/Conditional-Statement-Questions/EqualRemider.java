/*
8. Write a program to accept two numbers from user, if the both the numbers are positive, get the remainder of the division by 5 for both the numbers. If remainder of both the division are equal print numbers are equal, otherwise number are not equal. If one or both the numbers are negative, print calculation not possible.
*/

import java.util.Scanner;

public class EqualRemider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a>0 && b>0)
        {
            int x,y;
            x = a%5;
            y = b%5;
            if(x==y)
            {
                System.out.println("Numbers are Equal!!!");
            }
            else{
                System.out.println("Numbers are not Equals!!!");
            }
        }else{
            System.out.println("Calculation not Possible!!!");
        }
        sc.close();
    }
}
