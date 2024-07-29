/*
3. Write a program to print the sum of all the even values entered by user until user enter 0 to stop.

*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter the value: ");
            int a = sc.nextInt();
            if (a > 0) {
                if (a % 2 == 0) {
                    sum += a;
                }
            }
            else if(a==0){
                break;
            }
            else{
                System.out.println("Please enter positive number!!");
                continue;
            }
        }
        System.out.println("Total Even number sum : "+sum);
        sc.close();
    }
}
