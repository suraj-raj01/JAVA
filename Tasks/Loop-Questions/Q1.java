/*
1. Write a program to sum all the entered value until user enter 0 to stop.
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter the value: ");
            int a = sc.nextInt();
            if(a>0 || a<0)
            {
            sum += a;
            }
            else if(a==0){
                break;
            }
        }
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
