// Command Line Input

class AgeExc{
	public static void main(String args[])
	{
	int a=-1;
	try{
	a = Integer.parseInt(args[0]);
	if(a<0 || a>100)
	{
	userDefineExc ae = new userDefineExc("Invalid Age");
	throw ae;
	}
	System.out.println("Valid Age");
	}
	catch(userDefineExc x)
	{
	System.out.println(x.getMsg());
	}
	}
}