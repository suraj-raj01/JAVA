/*
Q7. Write a program in Java to input 5 numbers from the keyboard and find
their sum and average.
Test Data

Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0
*/

import java.util.Scanner;
class seventh{
	public static void main(String args[]){
		float a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 Numbers: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		d = sc.nextFloat();
		e = sc.nextFloat();
		
		float sum = a+b+c+d+e;
		float avg = (a+b+c+d+e)/5;
		
		System.out.println("Sum is: "+sum);
		System.out.println("Avg is: "+avg);
	}
}
		













