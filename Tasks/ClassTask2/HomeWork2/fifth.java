/*
Q5. Write a program to print cube of odd number from 1 to 10.
Cube of 1 = 1
Cube of 3 = 27
Cube of 5 = 125
Cube of 7 = 343
Cube of 9 = 729
*/

class fifth{
	public static void main(String args[]){
		for(int i=1; i<10; i++)
		{
		if(i%2!=0)
		{
		System.out.println("Cube of "+i+" = "+(i*i*i));
		}
		}
	}
}