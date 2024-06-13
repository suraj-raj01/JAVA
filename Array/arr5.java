// intput 5 student data using array.

import java.util.Scanner;
class arr5{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String arr[] = new String[5];
	System.out.println("Enter the Student Data");
	for(int i=0; i<arr.length; i++)
	{
	System.out.print("Enter Student name of "+i+"th Index: ");
	arr[i] = sc.nextLine();
	}
	
	System.out.println("Entered student name is: ");
	for(int i=0; i<arr.length; i++)
	{
	System.out.println(arr[i]);
	}
	}
}