class finalClass{
	final int X;
	public finalClass()
	{
	X = 20;
	}
	public static void main(String args[])
	{
	Hello t = new Hello();
	t.show();
	}

}
class Hello extends finalClass{
	public void show()
	{
	System.out.println("This is Parent class Show "+X);
	}	
	public static void main(String args[])
	{
	// Hello t = new Hello();
	// t.show();
	}
}