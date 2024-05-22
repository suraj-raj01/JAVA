/*
Write a program to print alternate numbers starting from 1
to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99
*/

class second{
	public static void main(String args[]){
		for(int i=1; i<=100; i++)
		{
		if(i%2!=0)
		{
		System.out.println(i);
		}
		}
	}
}