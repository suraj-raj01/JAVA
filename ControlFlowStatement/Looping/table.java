// Write a java program to print table of a number.

// using for loop

/*
import java.util.Scanner;
class table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		for(int i=1; i<=10; i++){
			System.out.println(n+" * "+i+" : "+(i*n));
		}
	}
}
*/

// using while loop
/*
import java.util.Scanner;
class table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int a = 1;
		while(a<=10){
			System.out.println(n+" * "+a+" : "+(a*n));
			a++;
		}
	}
}
*/

// using do while loop

import java.util.Scanner;
class table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int a = 1;
		do{
		System.out.println(n+" * "+a+" : "+(a*n));
		a++;
		}while(a<=10);
	}
}

