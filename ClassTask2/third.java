/*
3. Write a program to print alternate numbers starting from 0
to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100
*/

class third{
	public static void main(String args[]){
		for(int i=0; i<=100; i++)
			{
			if(i%2==0)
			{
			System.out.print(i+"  ");
			}
		}
	}
}