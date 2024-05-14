/*
Explaint else if statement in Java Programming:-
If we have more than two possibilities and we want to execute only one at a time then we should
go for else if statement.

else if statement depentds on if statement

Syntax:

if(condition){
//statement1
}
else if(condition){
//statement2
}
else if(condition){
//statement3
}
else{
//statement4
}
*/


// Write a java program to check character is upperCase, LowerCase,digits or special character.

import java.util.Scanner;
class elseIf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter any Character");
		ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println("Lower Case");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper Case");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("digits");
		}
		else{
			System.out.println("Special Character!");
		}
	}
}