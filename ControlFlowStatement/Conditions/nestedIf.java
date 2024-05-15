// Nested If 

// WAP to check given character is in lower case or in Uppercase


import java.util.Scanner;
class nestedIf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charcters: ");
		char ch = sc.next().charAt(0);
		if(ch>='a'){
			if(ch<='z'){
				System.out.println("LowerCase");
			}
		}
		
		else if(ch>='A'){
			if(ch<='Z'){
				System.out.println("UpperCase");
			}
		}
	}
}