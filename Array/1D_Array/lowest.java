// Write a java program to print lowest element from the array.

import java.util.Scanner;
class lowest{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the size of an array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];

	// input
	for(int i=0; i<n; i++)
	{
	arr[i] = sc.nextInt();
	}

	int low = arr[0];

	// output
	for(int i=0; i<n; i++)
	{
	if(arr[i]<low)
	{
	low = arr[i];
	}
	}
	System.out.println("Minimum Value : "+low);
	}
}