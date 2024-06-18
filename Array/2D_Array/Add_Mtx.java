// Write a java program to sum of two matrix.

import java.util.Scanner;
class Add_Mtx{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int arr1[][] = new int[3][3];
	int arr2[][] = new int[3][3];
	int sum[][] = new int[3][3];
	
	System.out.println("Enter elements of first matrix:\n");
	for(int i=0; i<3; i++)
	{
	for(int j=0; j<3; j++)
	{
	System.out.print("Enter the element index ["+i+","+j+"] : ");
	arr1[i][j] = sc.nextInt();
	}
	}

	System.out.println("\nEnter the elements of second matrix:\n");
	for(int i=0; i<3; i++)
	{
	for(int j=0; j<3; j++)
	{
	System.out.print("Enter the element index ["+i+","+j+"] : ");
	arr2[i][j] = sc.nextInt();
	}
	}
	
	//print data
	System.out.println();
	for(int i=0; i<3; i++)
	{
	for(int j=0; j<3; j++)
	{
	sum[i][j] = arr1[i][j]+arr2[i][j];
	System.out.print(sum[i][j]+" ");
	}
	System.out.println();
	}	

	}
}