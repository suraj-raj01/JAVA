/*
Q9. Write a program that accepts three numbers from the user and prints
&quot;increasing&quot; if the numbers are in increasing order, &quot;decreasing&quot; if the
numbers are in decreasing order, and &quot;Neither increasing or decreasing
order&quot; otherwise.
Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :

Increasing order
*/


import java.util.Scanner;
class ninth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c && b>c)
			{
			System.out.println("Decreasing");
		}
		else if(a<c && a<b && b<c)
		{
		System.out.println("Increasing");
		}
		else
		{
		System.out.println("Alternate");
		}
	}
}