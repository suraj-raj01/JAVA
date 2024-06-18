// Write a java program to find second largest element from an array.

import java.util.Scanner;
class SeconLargest{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	int max=arr[0];
	for(int i=0; i<arr.length; i++)
	{
	arr[i] = sc.nextInt();
	}

	for(int i=0; i<arr.length; i++)
	{
	if(arr[i]>max)
	{
	max = arr[i];
	}
	}
	System.out.println("Maximum Element: "+max);
	
	int max1 = arr[0];
	for(int i=0; i<arr.length; i++)
	{
	if(arr[i]>max1 && arr[i]<max)
	{
	max1 = arr[i];
	}
	}
	System.out.println("second Largest Element : "+max1);
	}
}