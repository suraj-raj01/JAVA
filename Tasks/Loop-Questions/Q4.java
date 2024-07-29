/*
4. Write a program to calculate sum of all the values entered also count the number of values entered by user, stop when user enter 0. Print the sum of the values and count.
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count = 0;
        while(true)
        {
            System.out.print("Enter the value: ");
            int x = sc.nextInt();
            if(x>0)
            {
                sum+=x;
                count++;
            }
            else if(x==0){
                break;
            }
            else{
                sum+=x;
                count++;
            }
        }
        System.out.println("Total sum is : "+sum);
        System.out.println("Total entered number is: "+count);
        sc.close();
    }
}
