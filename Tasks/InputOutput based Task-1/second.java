/*
2. Write a Java program to convert a given integer (in days) to years, months and days,assumes
that all months have 30 days and all years have 365 days.

Test Data : Input no. of days: 2535
Expected Output:
6 Year(s)
11 Month(s)
15 Day(s)
*/

import java.util.Scanner;
class second{
	public static void main(String args[]){
		int year,month,days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days: ");
		int day = sc.nextInt();
		
		year = day/365;
		month = day%365/30;
		days = day%365%30;
		System.out.println("YY:MM:DD - "+year+":"+month+":"+days);
		sc.close();
	}
}