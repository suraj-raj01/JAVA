// WAP to print sum and average of all array elements

import java.util.Scanner;
public class sum {
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
            sum+=arr[i];
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+sum/n);
        sc.close();
    }
}
