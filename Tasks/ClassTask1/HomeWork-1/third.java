/*
Q3. Write a Java program that reads two floating-point numbers and tests
whether they are the same up to three decimal places.
Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
*/

import java.util.Scanner;
class third{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextFloat();
		System.out.println("Enter the Second number: ");
		int b = sc.nextFloat();
		System.out.println("Enter the Third number: ");
		int c = sc.nextFloat();