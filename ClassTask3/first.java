/*
Q1. A Smith number is a composite number, whose sum of the digits is equal to the sum of its prime factors. For example:
4, 22, 27, 58, 85, 94, 121 ………. are Smith numbers.

Write a program in Java to enter a number and check whether it is a Smith number or not.

Sample Input: 666
Sum of the digits: 6 + 6 + 6 = 18
Prime factors are: 2, 3, 3, 37
Sum of the digits of the prime factors: 2 + 3 + 3 + (3 + 7) = 18
Thus, 666 is a Smith Number.
*/

import java.util.Scanner;
class first{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int k = n;
		int sum=0;
		while(n!=0)
		{
		sum+=n%10;
		n/=10;
		}
		System.out.println(sum);
		int prime = 0;
		for(int i=2; i<=k/2; i++)
		{
		if(k%i==0)
		{
		  prime=i;
		  System.out.println(prime);
		  k/=prime;
		}
		}
	}
}