/*
Q2. Write a Java program that reads a floating-point number and prints
&quot;zero&quot; if the number is zero. Otherwise, print &quot;positive&quot; or &quot;negative&quot;. Add
&quot;small&quot; if the absolute value of the number is less than 1, or &quot;large&quot; if it
exceeds 1,000,000.
Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
*/

import java.util.*;
class second{
	public static void main(String args[])		
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		float number = sc.nextFloat();
		if(number<0)
		{
			System.out.println("Negative");
		}

		else if(number>0)
		{
			System.out.println("Positive");
		}

		else
		{
			System.out.println("Zero");
		}
		float absolute = Math.abs(number);
		if(absolute<0){
		System.out.println("Small");	
		}
	}
}