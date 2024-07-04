/*
2. Write a program in java to read a sentence and replace lowercase
characters by uppercase and vice-versa. 
Test Data :
Input the string : This Is A Test String.
Expected Output :
The given sentence is : This Is A Test String.
After Case changed the string is: tHIS iS a tEST sTRING.
*/

public class Q2 {

	public static void main(String[] args) {
		String str1 = "This Is A Test String";
		char str[] = str1.toCharArray();

		System.out.println("Before Toggled string: ");
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str[i]);
		}

		for (int i = 0; i < str1.length(); i++) {
			if (str[i] >= 'A' && str[i] <= 'Z') {
				str[i] = (char) (str[i] + 'a' - 'A');
			} else if (str[i] >= 'a' && str[i] <= 'z') {
				str[i] = (char) (str[i] + 'A' - 'a');
			}
		}
		System.out.println("\nAfter Toggled string: ");
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str[i]);
		}
	}
}