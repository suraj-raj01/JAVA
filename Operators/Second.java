/*
Q1. Write a java program to print second last digit of the given  number.

import java.util.Scanner;
class Second{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number(in 4 digit): ");
	int n = sc.nextInt();
	int ans = n%100/10;
	System.out.println("Ans: "+ans);
	}
}
*/


/*
Q2. Write a java program to convert given amount into smallest  possible bank notes.
Enter Amount : 1388
Notes of 100: 13
Notes of 50 : 1
Notes of 20: 1
Notes of 10: 1
Notes of 5: 1
Notes of 2: 1
Notes of 1: 1
*/

import java.util.Scanner;
class Second{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Amount: ");
	int n = sc.nextInt();
	int hund = n/100;
	System.out.println("Notes of 100 : "+hund);
	int fifty = n%100/50;
	System.out.println("Notes of 50 : "+fifty);
	int twenty = n%100%50/20;
	System.out.println("Notes of 20 : "+twenty);
	int ten = n%100%50%20/10;
	System.out.println("Notes of 10 : "+ten);
	int five = n%100%50%20%10/5;
	System.out.println("Notes of 5 : "+five);
	int two = n%100%50%20%10%5/2;
	System.out.println("Notes of 2 : "+two);
	int one = n%100%50%20%10%5%2/1;
	System.out.println("Notes of 1 : "+one);
	}
}


/*
Output:
Enter the Amount:
1388
Notes of 100 : 13
Notes of 50 : 1
Notes of 20 : 1
Notes of 10 : 1
Notes of 5 : 1
Notes of 2 : 1
Notes of 1 : 1
*/







