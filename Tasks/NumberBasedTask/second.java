/*
Q2. Write a program to create the first twenty Hamming numbers.
In computer science, regular numbers are often called Hamming numbers,
Hamming Numbers are numbers whose only prime factors are 2, 3 and 5.
The first few hamming numbers are :
1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25, 27, 30, 32
Expected Output
First Twenty Hamming numbers: 1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25
27 30 32 36
*/

class second{ 
	public static void main(String args[])
	{
	int n=1;
	System.out.println(n+" ");
	while(n!=40)
	{
		if(n%2==0 || n%3==0 || n%5==0)
		{
			System.out.println(n+" ");
		}
		n++;
	}
	}
}