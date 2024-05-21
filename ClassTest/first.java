/*
Write a program to accept a number N and print
whether it is positive, negative or zero
*/

import java.util.Scanner;
class first{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	if(n<0)
	{
	System.out.println("Negative");
	}
	else if(n>0)
	{
	System.out.println("Positive");
	}
	else{
	System.out.println("Zero");
	}
}
}