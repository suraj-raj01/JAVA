/*
2. Write a program in java to count total number of alphabets, digits and
special characters in a string.
Test Data :
Input the string : Welcome to w3resource.com
Expected Output :
Number of Alphabets in the string is : 21
Number of Digits in the string is : 1
Number of Special characters in the string is : 4
*/

class Q2 {
	public static void main(String args[]) {
		int a = 0, b = 0, c = 0;
		String str = new String("Welcome to w3resource.com");
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' || str.charAt(i) >= 'A') && (str.charAt(i) <= 'z' || str.charAt(i) <= 'Z')) {
				a++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("Number of Alphabets in the string is : " + a);
		System.out.println("Number of Digits in the string is : " + b);
		System.out.println("Number of Special characters in the string is : " + c);
	}
}
