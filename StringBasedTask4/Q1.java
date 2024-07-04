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

class Q1 {
	public static void Search(String s, String search) {

		String sk[] = s.split(" ");
		String arr = "";
		int flag = 0;
		for (int i = 0; i < sk.length; i++) {
			if (sk[i].equalsIgnoreCase(search)) {
				// System.out.println("YES");
				arr += sk[i];
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println(arr + " -> is present in this sentence");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s = sc.nextLine();
		System.out.println("Enter a string for search: ");
		String search = sc.nextLine();
		Search(s, search);
		sc.close();
	}
}