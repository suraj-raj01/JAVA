/*
Write a program to accept two numbers and print
the greater value of the two
*/


import java.util.Scanner;
class second{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n = sc.nextInt();
		System.out.println("Enter the second number: ");
		int m = sc.nextInt();
		if(n>m){
		System.out.println(n+" is greater");
		}
		else{
		System.out.println(m+" is greater");
		}
	}
}