/*
Q4. Write a Java program to integral quotient and remainder of a division
Input numerator : 2500
Input denominator : 235
quotient = 10, remainder = 150
*/


import java.util.Scanner;
class fourth{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int quotient,remainder;
	System.out.println("Enter the numerator: ");
	int numerator = sc.nextInt();
	System.out.println("Enter the denominator: ");
	int denominator = sc.nextInt();

	quotient = numerator/denominator;
	remainder = numerator%denominator;

	System.out.println("Quotient: "+quotient);
	System.out.println("Remainder: "+remainder);
	}
}	