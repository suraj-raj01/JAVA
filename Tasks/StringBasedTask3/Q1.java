/*
1. Write a program in java to compare two strings
Test Data :
Check the length of two strings:
--------------------------------
Input the 1st string : aabbcc
Input the 2nd string : abcdef
String1: aabbcc
String2: abcdef
Expected Output : Strings are not equal.
Check the length of two strings:
--------------------------------
Input the 1st string : aabbcc
Input the 2nd string : aabbcc
String1: aabbcc
String2: aabbcc
Expected Output : Strings are equal.
*/

import java.util.Scanner;
class Q1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String str1 = sc.nextLine();

		System.out.println("Enter the second String : ");
		String str2 = sc.nextLine();

		String s1 = new String(str1);
		String s2 = new String(str2);
		if(s1.length()==s2.length())
		{
			if(s1.equals(s2))
			{
			System.out.println("String are Equal");
			}
			else{
			System.out.println("String are not Equal");
			}
		}
		else{
		System.out.println("String Length are not Equal");
		}
		sc.close();
	}
}