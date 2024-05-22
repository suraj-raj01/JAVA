/*
Q5. Write a Java program that requires the user to enter a single
character from the alphabet. Print Vowel or Consonant, depending on user
input. If the user input is not a letter (between a and z or A and Z), or is a
string of length &gt; 1, print an error message.
Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant
*/

import java.util.Scanner;
class fifth{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		if(ch >='a' && ch<='z' || ch>='A' && ch<='Z')
		{
		switch(ch)
			{
			case 'a':
			case 'A':
			System.out.println("Vowel");
			break;
			
			case 'e':
			case 'E':
			System.out.println("Vowel");
			break;

			case 'i':
			case 'I':
			System.out.println("Vowel");
			break;

			case 'o':
			case 'O':
			System.out.println("Vowel");
			break;

			case 'u':
			case 'U':
			System.out.println("Vowel");
			break;

			default:
			System.out.println("Constant");
			
			}
		}
		else{
		System.out.println("Not a Character");
		}
	}
}