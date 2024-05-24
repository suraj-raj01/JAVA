/*
Q3. A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.

Note: All even integer numbers greater than 4 are Goldbach numbers.

Example:

6 = 3 + 3
10 = 3 + 7
10 = 5 + 5

Hence, 6 has one odd prime pair 3 and 3. Similarly, 10 has two odd prime pairs, i.e. 3 and 7, 5 and 5.

Write a program to accept an even integer 'N' where N > 9 and N < 50. Find all the odd prime pairs whose sum is equal to the number 'N'.

Test your program with the following data and some random data:

Example 1

INPUT:
N = 14

OUTPUT:
PRIME PAIRS ARE:
3, 11
7, 7

Example 2

INPUT:
N = 30

OUTPUT:
PRIME PAIRS ARE:
7, 23
11, 19
13, 17

Example 3

INPUT:
N = 17

OUTPUT:
INVALID INPUT. NUMBER IS ODD.

Example 4

INPUT:
N = 126

OUTPUT:
INVALID INPUT. NUMBER OUT OF RANGE.
*/


import java.util.Scanner;
class third{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between (10-50): ");
		int n = sc.nextInt();
		int t = n;
		int count=0;
		for(int i=1; i<=n; i++)
		{
		for(int j=1; j<=i; j++)
		{
		if(i%j==0)
		{
		count++;
		}
		}
		}
		if(count==2)
		{
		System.out.println("Prime");
		System.out.println(t);
		
		}
	}
}









