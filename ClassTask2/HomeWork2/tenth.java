/*
Q5. A number is said to be Duck if the digit zero is (0) present in it. Write a program
to accept a number and check whether the number is Duck or not. The program
displays the message accordingly. (The number must not begin with zero)
Sample Input: 5063
Sample Output: It is a Duck number.
*/

import java.util.Scanner;
class tenth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int duck=1;
		
		while(n!=0)
		{
		int r = n%10;
		if(r==0)
		{
		duck=r;
		}
		n=n/10;
		}
		if(duck==0)
		{
		System.out.println("It is a Duck number");
		}
		else{
		System.out.println("Not a Duck number");
		}
	}
}