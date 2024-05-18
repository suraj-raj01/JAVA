// Write a Java Program to check number is prime or not.


import  java.util.Scanner;
class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int k = n;
		int count=0;
		while(k!=0){
			if(n%k==0){
			count++;
			}
			k--;
		}
		if(count==2){
		System.out.println("Prime");
		}
		else{
		System.out.println("Not Prime");
		}
	}
}