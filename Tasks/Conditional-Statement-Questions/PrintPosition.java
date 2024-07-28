
/*
1. Write a program that accept an integer form user and print positive, if the integer is positive.
*/

import java.util.Scanner;
public class PrintPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n>=0)
        {
            System.out.println(n+" is Positive Number!!");
        }
        sc.close();
    }
}
