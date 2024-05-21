/*
Q1. Write a Java program that takes three numbers from the user and
prints the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
*/


import java.util.Scanner;
class first{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		
		if(a>b && a>c)
			{
			System.out.println(a+" is Greatest");
		}

		else if(b>a && b>c)
			{
			System.out.println(b+" is Greatest");
		}

		else
		{
		System.out.println(c+" is Greatest");
		}
		
	}
}



