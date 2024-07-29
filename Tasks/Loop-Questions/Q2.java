/*
2. Write a program to check all the values entered by user, if the entered value is even print, 
if the entered value is odd print odd, if the entered value is 0 stop.
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number: ");
            int a = sc.nextInt();
            if (a > 0) {
                if (a % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("odd");
                }
            } else if(a==0) {
                break;
            }
            else{
                System.out.println("Plese enter positive number");
                continue;
            }
        }
        sc.close();
    }
}
