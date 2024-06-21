// Write a java program to calculate factorial of given number using recursion.

import java.util.Scanner;
class factorial{

	public static int fact(int n)
	{
	if(n==0)
	{
	return 1;
	}
	return n*fact(n-1);
	}

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	System.out.println("factorial is : "+fact(n));
	}
}