/*
Q6. An Abundant number is a number for which the sum of its proper factors is
greater than the number itself. Write a program to input a number and check and
print whether it is an Abundant number or not.

Example:

Consider the number 12.

Factors of 12 = 1, 2, 3, 4, 6 Sum of factors = 1 + 2 + 3 + 4 + 6 = 16

As 16 &gt; 12 so 12 is an Abundant number.
*/

import java.util.Scanner;
class sixth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<n; i++)
			{
			if(n%i==0)
			{
			sum+=i;
			}
		}
		if(sum>n)
		{
		System.out.println("Abundant Number");
		}
		else
		{
		System.out.println("Not Abundant Number");
		}
	}
}