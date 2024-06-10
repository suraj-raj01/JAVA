/*
Q3. Write a Java program that read 5 numbers and print the average of all values.
Test Data :
First Number : 4
Second Number : 6
Third Number: 8
Fourth Number : 10
Fifth Number : 12

Expected Output:
Average value of the all numbers: 8.00
*/


import java.util.Scanner;
class third{
	public static void main(String args[]){
		double a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = sc.nextDouble();

		System.out.print("Enter the second number: ");
		b = sc.nextDouble();

		System.out.print("Enter the third number: ");
		c = sc.nextDouble();

		System.out.print("Enter the fourth number: ");
		d = sc.nextDouble();

		System.out.print("Enter the fifth number: ");
		e = sc.nextDouble();
		
		double average = (a+b+c+d+e)/5;
		System.out.println("Average : "+average);
		sc.close();
	}
}

