/*
Q6. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/


import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("sum is : "+sum);

		int sub = a-b;
		System.out.println("sub is: "+sub);
		
		int mul = a*b;
		System.out.println("multiplication : "+mul);

		int div = a/b;
		System.out.println("Division is : "+div);
	
		int modul = a%b;
		System.out.println("Modulus is : "+modul);
	}
}