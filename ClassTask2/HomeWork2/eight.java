/*
Q8. Write a program to accept a number and check whether it is a &#39;Spy Number&#39; or
not. (A number is spy if the sum of its digits equals the product of its digits.)

Example: Sample Input: 1124
Sum of the digits = 1 + 1 + 2 + 4 = 8
Product of the digits = 1*1*2*4 = 8
*/


import java.util.Scanner;
class eight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int t = n;
		int sum=0;
		int product=1;
		while(n!=0)
		{
		int r = n%10;
		sum+=r;
		product*=r;
		n=n/10;
		}
		if(sum==product)
		{
		System.out.println("Spy Number");
		}
		else{
		System.out.println("Not a Spy Number");
		}
	}
}