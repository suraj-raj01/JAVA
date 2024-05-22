/*
Q7. Write a program to input a number. Check and display whether it is a Niven
number or not. (A number is said to be Niven which is divisible by the sum of its
digits).

Example: Sample Input 126
Sum of its digits = 1 + 2 + 6 = 9 and 126 is divisible by 9.
*/

import java.util.Scanner;
class seventh{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		