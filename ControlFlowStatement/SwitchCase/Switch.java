// Switch(constant/variable/expression/function call)

import java.util.Scanner;
class Switch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		switch(ch){
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
			System.out.println("Not a Vowel!!");
		}
	}
}