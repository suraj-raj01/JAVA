/*
Final keyword in Java Programming:-
We can't change value of final variable
*/

class finalVar{
	final int X;
	public finalVar()
	{
		X = 20;
	}
	public void show()
	{
	System.out.println("X is : "+X);
	}
  public static void main(String args[])
	{
	finalVar obj = new finalVar();
	obj.show();
	}
}