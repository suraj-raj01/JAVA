/*
1. Write a C program to check whether a given substring is present in the
given string.
Test Data :
Input the string : This is a test string.
Input the substring to be search : search
Expected Output :
The substring is not exists in the string.
*/

import java.util.Scanner;
class Q1{
	public static void Search(String s,String search)
	{
	
	String sk[] = s.split(" ");
	for(int i=0; i<sk.length; i++)
	{
		if(sk[i].equals(search)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
			break;
		}
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s = sc.nextLine();
		System.out.println("Enter a string for search: ");
		String search = sc.nextLine();
		Search(s,search);
		sc.close();
	}
}