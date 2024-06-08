
class Str2{
	public static void main(String args[])
	{

	// String length() method:-

	String s = "Welcome";
	System.out.println("String is: "+s);
	int l = s.length();
	System.out.println("String length : "+l);

	// String split() method:-
	
	String s1 = "Welcome to the city of Lakes";
	String arr[] = s1.split(" ");
	int len = arr.length;
	System.out.println("Number of Words : "+len);
	
	// SubString() method
	
	String s2 = "Welcome";
	String x = s2.substring(3);
	System.out.println(x);
	String y = s2.substring(0,3);
	System.out.println(y);

	// String charArray() method
	
	String s3 = "Welcome";
	char arr1[] = s3.toCharArray();
	System.out.println("length of the character array: "+arr1.length);
	

	// toUpperCase() method
	String a = "welcome";
	String b = a.toUpperCase();
	System.out.println(b);
	}
	
}	