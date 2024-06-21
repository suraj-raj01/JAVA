// Write a program to print sum of n natural number using recursion.

class rec1{

	public static int sum(int n){
	if(n==1)
	{
	return 1;
	}
	else{
	return n+sum(n-1);
	}
	}

	public static void main(String args[])
	{
	System.out.print(sum(5));
	}
}