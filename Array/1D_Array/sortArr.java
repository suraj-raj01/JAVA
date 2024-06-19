// Write a java program to sort an array.

import java.util.Scanner;
class sortArr{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++)
	{
	arr[i] = sc.nextInt();
	}

	System.out.println("Before Sorting:");
	for(int i=0; i<n; i++)
	{
	System.out.print(arr[i]+" ");
	}

	for(int i=0; i<n; i++)
	{
	for(int j=i+1; j<n; j++)
	{
	if(arr[i]<arr[j])
	{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;	
	}
	}
	}
	
	System.out.println("\nAfter Sorting:");
	for(int i=0; i<n; i++)
	{
	System.out.print(arr[i]+" ");
	}
	sc.close();
	}
}