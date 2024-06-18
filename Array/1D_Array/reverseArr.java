// Write a java program to print elements in reverse order.

import java.util.Scanner;
public class reverseArr{
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
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}