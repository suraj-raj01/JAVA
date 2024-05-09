/*

Operators:
Q1. Explain Operators in java programming?
Ans:  Operators are symbols that tells to the compiler to  perform some specific task
Example:
C=10+20;
In above expression =,+ are operators and C,10,20 are operators
 
Types of Operators on the basis of Number of Operand
1. Unary Operator:  It takes only one operand at a time and perform some specific operations
Example:  i++,!,~,
 
2. Binary operators: It takes two operand at a time and perform some operations
Example: >,<,==, +,-,*,/,%
 
3. Ternary Operator: It Takes three operand at a time and perform some specifc operation
Example: exp1 ? exp2: exp3;
 
 
Types of Operators on the basis of functionalities
1. Arithmetic operators[+,-,*,/,%,++,--]
2. Relational Operators[>,<,>=,<=,==,!=]
3. Logical Operators [&&,||,!]
4. Bitwise Operators[&,|,~,<<,>>,^]
5. Conditional Operators/ Ternary Operators[? : ]
6. Assignment Operators[=,+=,-=,*=,/=]
 

*/

// Explain Modulo Operator in java porgramming
/*
if we want to find reminder of any number then we should go for module operator.

modulo(%)
first Operand % second Operand
Example: 
10%3 = 1
35%4 = 3
4%10 = 4
Note: in case of modulo operator if first operand is less than second operand then reminder will be first operand

Division
first Operand / second operand
Example: 10/3 = 3


*/


// Write a java program to return last digit.

import java.util.Scanner;
class opr{
	public static void main(String  args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int last = n%10;
		System.out.println("last digit: "+last);
	}
}







