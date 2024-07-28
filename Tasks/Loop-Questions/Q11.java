/*
11. Write a program which accepts the starting point and end point from the user and print 
    the sum and count of all the even values between the starting point and end point. 
    Starting point and end point both are inclusive.
    Sample run
    enter the starting point - 10
    enter the end point - 20
    sum = 90
    count = 6
   
   
    Explaination:
    sum all the even values between 10 to 20, as starting point and end point both are inclusive 
    10 + 12 + 14 + 16 + 18 + 20
    so the result is 90, and count is 6
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending point: ");
        int end = sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=start; i<=end; i++)
        {
            if(i%2==0)
            {
                sum+=i;
                count++;
            }
        }
        System.out.println("Sum of even Number is: "+sum);
        System.out.println("Total even number is: "+count);
        sc.close();
    }
}
