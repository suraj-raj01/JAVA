/*
Q4. Write a program to print Sqaure of Even number from 10 To 20

10 Square is : 100
12 Square is : 144
14 Square is : 196
16 Square is : 256
18 Square is : 324
20 Square is : 400
*/

class fourth{
	public static void main(String args[]){
		for(int i=10; i<=20; i++)
		{
		if(i%2==0)
		{
		System.out.println(i+" Square is : "+(i*i));
		}
		}
	}
}