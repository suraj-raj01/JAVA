// Write a Java Program of simple Calculator.


import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("Enter the operators");
		System.out.println("==========================");
		System.out.println("+ -> Addition");
		System.out.println("- -> Subtraction");
		System.out.println("* -> Multiplication");
		System.out.println("/ -> Division");
		System.out.println("% -> modulus");
		System.out.println("==========================");
		System.out.print("Operator: ");
		char opr = sc.next().charAt(0);
		
		int a,b;
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();	
		
		switch(opr)
			{
			case '+':
			System.out.print("Addition : ");
			System.out.println(a+b);
			break;

			case '-':
			System.out.print("Subtraction : ");
			System.out.println(a-b);
			break;

			case '*':
			System.out.println("Multiplication : "+a*b);
			break;

			case '/':
			System.out.println("Division : "+a/b);
			break;

			case '%':
			System.out.println("Modulus : "+a%b);
			break;

			default:
			System.out.println("Please enter valid Operator!!");
		}
	}
}


/*
==========================
Enter the operators
==========================
+ -> Addition
- -> Subtraction
* -> Multiplication
/ -> Division
% -> modulus
==========================
Operator: -
Enter the first number: 60
Enter the second number: 20
Subtraction : 40
*/