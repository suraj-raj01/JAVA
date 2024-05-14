/*
if else conditions:-
If we have exactly two possibility then we should go for if else statement.

Syntax:

if(condition){
  // Statements
}
else{
  //Statement
}
*/

// Write a java program to check given number is odd or even.
/*
import java.util.Scanner;
class ifelseCon{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = sc.nextInt();
		if(a%2==0){
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
	}
}
*/

// Write a java program to check given number is odd or even is positive or negative.

import java.util.Scanner;
class ifelseCon{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = sc.nextInt();
		if(a%2==0){
			System.out.println("Even Number");
			if(a>0){
				System.out.println("Positive Number");
			}
			else{
				System.out.println("Negative Number");
			}
		}
		else{
			System.out.println("Odd Number");
		}
	}
}
