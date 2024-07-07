// Write a java program to print table of a number using method.
// Taking something and returning nothing.

import java.util.Scanner;
class table{

	public static void printTable(int n)
	{
	for(int i=1; i<=10; i++)
	{
	System.out.println(n+" * "+i+" : "+n*i);
	}	
	}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	printTable(n);
	sc.close();
	}
}