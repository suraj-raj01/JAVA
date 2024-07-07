// Taking something returning nothing.

import java.util.Scanner;
class method3{
	public static void sum(int a, int b)
	{
	int c = a+b;
	System.out.println("Sum is : "+c);
	}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number : ");
	int a = sc.nextInt();
	System.out.print("Enter the second number : ");
	int b = sc.nextInt();
	sum(a,b);
	sc.close();
	}
}