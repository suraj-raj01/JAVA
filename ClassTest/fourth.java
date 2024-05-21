/*
Write a program to accept two numbers and print
whether their sum is EVEN or ODD
*/

import java.util.Scanner;
class fourth{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		int c = a+b;
		if(c%2==0)
			{
			System.out.println("Even Nmber");
		}
		else{
		System.out.println("Odd Number");
		}
	}
}
		