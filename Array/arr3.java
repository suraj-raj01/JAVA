// Input from user.

import java.util.Scanner;
class arr3{
	public static void main(String args[])
	{
	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the elements of index 0 : ");
	arr[0] = sc.nextInt();
	System.out.print("Enter the elements of index 1 : ");
	arr[1] = sc.nextInt();
	System.out.print("Enter the elements of index 2 : ");
	arr[2] = sc.nextInt();
	System.out.print("Enter the elements of index 3 : ");
	arr[3] = sc.nextInt();
	System.out.print("Enter the elements of index 4 : ");
	arr[4] = sc.nextInt();
	
	System.out.println("\nEntered Element is: ");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	sc.close();
	}
}