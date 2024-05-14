/*

class ifCon{
	public static void main(String args[]){
		int a,b;
		a = 10;
		b = 20;

		if(a>b)
		System.out.println("a is Greater");
		System.out.println("HELLO!");
		
		if(a<b)
		System.out.println("b is Greater");
		System.out.println("HELLO!!");

		if(a==b)
		System.out.println("Equal");
		System.out.println("HELLO!!!");
	}
}
*/

import java.util.Scanner;
class ifCon{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = sc.nextInt();
		if(a>0)
		System.out.println("Positive");
		
		if(a<0)
		System.out.println("Negative");

		if(a==0)
		System.out.println("Zero");
	}
}



