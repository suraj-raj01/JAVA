class Str3{
	public static void main(String args[])
	{

	// String trim() method basically use for remove first and last spaces.
	String str = "  Hello  World  ";
	System.out.println("Length before trim: "+str.length());
	String s = str.trim();
	System.out.println("Length after trim: "+s.length());

	// String valueOf() method in java programming
	// It is use for one datatype to another like typcasting
	int a = 1365;
	String x = String.valueOf(a);
	System.out.println("Value in String: "+x);
	System.out.println("Length of the value: "+x.length());

	// Concatenation String
	String s1 = "Hello";
	String s2 = s1+" World";
	String s3 = s2+" Welcome";
	String s4 = s3+" To";
	String s5 = s4+" Bhopal";
	System.out.println(s5);

	//StrignBuffer() it is mutable we can modify them.
	
	StringBuffer string = new StringBuffer("Hello");
	string.append(" World");
	string.append(" Welcome");
	string.append(" To");
	string.append(" Bhopal");
	System.out.println(string);
	}
}