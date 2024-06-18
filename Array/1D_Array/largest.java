// Write a java program to print largest element from the array.

import java.util.Scanner;
class largest{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the size of an array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	
	for(int i=0; i<n; i++)
	{
	arr[i] = sc.nextInt();
	}

	int max = arr[0];

	for(int i=0; i<n; i++)
	{
	if(arr[i]>max)
	{
	max = arr[i];
	}
	}
	System.out.println("Maximum Value : "+max);
	}
}