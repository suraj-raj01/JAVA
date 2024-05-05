// Write a Java Program to take input character from the user.

import java.util.Scanner;
class Char{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		System.out.println("Input Character is: "+ch);
	}
}