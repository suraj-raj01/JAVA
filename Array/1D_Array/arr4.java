// take input using loop.

import java.util.Scanner;
class arr4{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the "+n+" elements");
	for(int i=0; i<arr.length; i++)
	{
	System.out.print("Enter element of "+i+" Index: ");
	arr[i] = sc.nextInt();
	}
	
	System.out.println("Entered Elements is: ");
	for(int i=0; i<arr.length; i++)
	{
	System.out.print(arr[i]+" ");
	}
	sc.close();
	}
}