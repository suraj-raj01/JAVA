class fib{

	public static void fibo(int n)
	{
	int a,b;
	a=0;
	b=1;
	System.out.print(a+" "+b);
	for(int i=2; i<n; i++)
	{
	int c = a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
	}
	}

	public static void main(String args[])
	{
	fibo(8);
	}
}