// Write a Java Program to generate square of a number take input by user.

import java.util.Scanner;
class Square{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.print("Square is: "+n*n);
	}
}