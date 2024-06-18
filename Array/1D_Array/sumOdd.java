// WAP to print sum of all odd number of an array elements.

import java.util.Scanner;
public class sumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // for input
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum=0;
        // for sum
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
		{
		sum+=arr[i];
		}
        }
        System.out.println("Sum of all Odd number: "+sum);
        //System.out.println("Average is: "+sum/n);
        sc.close();
    }
}