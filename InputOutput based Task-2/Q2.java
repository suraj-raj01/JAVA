/*
Q2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
*/

import java.util.Scanner;
class Q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		c = a+b;
		System.out.println("Sum is: "+c);
	}
}
		