/*
Write a program to accept a number N and print
whether the number is EVEN or ODD
*/

import java.util.Scanner;
class third{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		if(n%2==0)
			{
			System.out.println("Even Number");
		}
		else{
		System.out.println("Odd Number");
		}
	}
}