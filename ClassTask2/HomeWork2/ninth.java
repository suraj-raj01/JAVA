/*
Q9. A special two-digit number is such that when the sum of its digits is added to the
product of its digits, the result is equal to the original two-digit number.

Example: Consider the number 59.
Sum of digits = 5 + 9 = 14
Product of digits = 5 * 9 = 45
Sum of the sum of digits and product of digits = 14 + 45 = 59

Write a program to accept a two-digit number. Add the sum of its digits to the
product of its digits. If the value is equal to the number input, then display the
message &quot;Special two—digit number&quot; otherwise, display the message &quot;Not a special
two-digit number&quot;


*/

import java.util.Scanner;
class ninth{
	public static void main(String args[]){
		int n,sum=0,product=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		int t = n;
		if(n>99 || n<0)
		{
		System.out.println("Please enter 2 digit number!!");
		}
		else{
		while(n>0)
			{
			int r = n%10;
			sum+=r;
			product*=r;
			n=n/10;
			}
			if(t==(sum+product))
			{
			System.out.println("Special two-digit");
		}else{
		System.out.println("Not Special two-digit");
		}
		}
		
	}
}