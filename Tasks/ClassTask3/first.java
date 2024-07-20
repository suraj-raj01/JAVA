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
	public static boolean isPrime(int n)
	{
		for(int i=2; i<=n/2; i++)
		{
			if(i%2==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void printPrime(int n)
	{
		int sum=0;
		int k = n;
		while(k!=0){
		while(n!=0)
		{
			int r = n%10;
			sum+=r;
			n/=10;
		}
		int Psum=0;
		for(int i=2; i<=n; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" ");
				Psum+=i;
			}
		}
		if(sum==Psum)
		{
			System.out.println("Smith Number");
		}
		k--;
	}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		printPrime(n);
		sc.close();
	}
}