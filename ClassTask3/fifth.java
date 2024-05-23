/*
Q5. Armstrong Number Program in Java

Armstrong Number is a positive number if it is equal to the sum of cubes of its digits is called Armstrong number and if its sum is not equal to the number then its not a Armstrong number. Armstrong Number Program is very popular in java, c language, python etc. Examples: 153 is Armstrong, (1*1*1)+(5*5*5)+(3*3*3) = 153
*/


import java.util.Scanner;
class fifth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int t = n;
		int sum=0;
		while(n!=0)
		{
		int r = n%10;
		sum +=r*r*r;
		n/=10;
		}
		if(t==sum){
		System.out.println("Armstrong Number");
		}
		else{
		System.out.println("Not Armstrong Number");
		}
	}
}