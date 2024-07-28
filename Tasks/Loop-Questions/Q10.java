/*
10. Write a program which accepts the starting point and end point from the user and print the sum of all the values between the starting point and end point. Starting point is inclusive and end point is exclusive.
    Sample run
    enter the starting point - 10
    enter the end point - 15
    sum = 60
   
    Explaination:
    sum all the values between 10 to 15, as starting point is inclusive 
    10 + 11 + 12 + 13 + 14
    15 is not considered for sum as loop must iterate < 15
    so the result is 60
*/

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending point: ");
        int end = sc.nextInt();
        int sum=0;
        for(int i=start; i<end; i++)
        {
            sum+=i;
        }
        System.out.println("Sum is: "+sum);
        sc.close();
    }
}

/*
Enter the starting point: 
10
Enter the ending point: 
15
Sum is: 60
*/