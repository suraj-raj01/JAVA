/*

Operators:


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







