// WAP to take input from the user and print sum first and last digit of that number.

import java.util.Scanner;
class firstLast{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int last = n%10;
		int first = n;
		while(first>=10){
			first = first/10;
		}
		System.out.println("First Digit : "+first);
		System.out.println("Last Digit : "+last);
		System.out.println("sum is : "+(first+last));
	}
}