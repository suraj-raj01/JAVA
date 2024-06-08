// Concatenation in Java Programming
/*
class concat{
	public static void main(String args[])
	{
		String s1 = new String("SURAJ");
		String s2 = new String("KUMAR");
		System.out.println(s1==s2);

		String s3 = "SURAJ";
		String s4 = "KUMAR";
		System.out.println(s3==s4);
		System.out.println(s3.compareTo(s4));

		int a = 20;
		String b = "20";
		System.out.println(a+b);
	}
}
*/

import java.util.Scanner;
class concat{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the password");
	String pass = sc.next();

	if(pass.length()>8){
	System.out.println("Enter the conf Password");
	String cpass = sc.next();
	if(pass.equals(cpass))
	{
	System.out.println("Correct Password");
	}
	else
	{
	System.out.println("Invalid Password!!");
	}
	}
	else
	System.out.println("Please enter 8 character Password!");
	sc.close();
	}
}