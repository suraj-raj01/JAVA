/*
Q8. Write a Java program that displays the sum of n odd natural numbers.
Test Data
Input number of terms is: 5
Expected Output :
The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number upto 5 terms is: 25
*/


import java.util.Scanner;
class eight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<n*2; i++)
			{
			if(i%2!=0){
			sum+=i;
			}
		}
		System.out.println(sum);
	}
}