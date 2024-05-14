/*
Q5. Write a Java program that takes two numbers as input and displays the product of two
numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/


import java.util.Scanner;
class Q5{
	public static void main(String args[]){
		int a,b,product;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();	
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		product = a*b;
		System.out.println("product is: "+product);
	}
}