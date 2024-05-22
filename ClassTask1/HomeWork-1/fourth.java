/*
Q4. Write a Java program to find the number of days in a month.
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/

import java.util.Scanner;
class fourth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month number: ");
		int month = sc.nextInt();
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		switch(month)
		{
		case 1:
			System.out.println("january "+year+" has "+31+" days");
			break;

		case 2:
		if(year%4==0 && (year%400==0 || year%100!=0)){
			System.out.println("february "+year+" has "+29+" days");
			break;
		}
		else
		{
		System.out.println("february "+year+" has "+28+" days");
		}
		break;

		case 3:
			System.out.println("march "+year+" has "+31+" days");
			break;

		case 4:
			System.out.println("april "+year+" has "+30+" days");
			break;

		case 5:
			System.out.println("may "+year+" has "+31+" days");
			break;

		case 6:
			System.out.println("june "+year+" has "+30+" days");
			break;

		case 7:
			System.out.println("july "+year+" has "+31+" days");
			break;

		case 8:
			System.out.println("august "+year+" has "+31+" days");
			break;

		case 9:
			System.out.println("september "+year+" has "+30+" days");
			break;
		case 10:
			System.out.println("october "+year+" has "+31+" days");
			break;

		case 11:
			System.out.println("november "+year+" has "+30+" days");
			break;

		case 12:
			System.out.println("september "+year+" has "+31+" days");
			break;
		default:
			System.out.println("Please enter valid number(1+12)!!");
		}
	}
}