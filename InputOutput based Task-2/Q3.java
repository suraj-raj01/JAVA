
/*
Q3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
*/

import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,denom,res;
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		System.out.println("Enter the denomenator: ");
		denom = sc.nextInt();
		res = n/denom;
		System.out.println("Result: "+res);
	}
}