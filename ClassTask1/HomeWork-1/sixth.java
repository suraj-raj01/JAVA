/*
Q6. Write a Java program that takes a year from the user and prints
whether it is a leap year or not.
Test Data
Input the year: 2016
Expected Output :
2016 is a leap year
*/


import java.util.Scanner;
class sixth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		if(year%4==0 && (year%400==0 || year%100!=0))		
			{
			System.out.println("Leap Year");
		}
		else
		{
		System.out.println("Not a Leap Year");
		}
	}
}
