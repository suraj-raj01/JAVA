public class Str1 {
    public static void main(String[] args) {
        // Contains() method in java programming
        /*
         Syntax:
         String a = "abcd";
         bolean b = a.contains("b");
         print(b) // true
         */
	
	/*
         String str = "Welcome to Bhopal";
         Boolean b = str.contains("to");
         System.out.println(b);		// true
         Boolean c = str.contains("Java");
         System.out.println(c);		// false
	*/

	// endsWith() Methods in Java Programming
	/*
	It is used to check a string ends with a suffix
	Syntax:
	boolean endsWidth();
	*/
	
	/*
	String url = "www.cybrom.com";
	Boolean bool = url.endsWith(".com");
	System.out.println(bool);	// true

	Boolean bool1 = url.endsWith("www");
	System.out.println(bool1);	// false
	*/


	// startsWith() Method in Java Programming
	
	String s = "www.cybrom.com";
	Boolean b1 = s.startsWith("www");
	System.out.println(b1);		// true

	Boolean b2 = s.startsWith("cybrom");
	System.out.println(b2);		// false

	// indexOf() Method in Java Programming
	
	/*
	String i = "WELC OME";
	int n = i.indexOf(" ");
	int m = i.indexOf("E",2);
	int o = i.indexOf("ME");
	System.out.println(n);
	System.out.println(m);
	System.out.println(o);
	*/

	// lastIndexOf() Methods
	String x = "WELCOME";
	int y = x.lastIndexOf("E");
	System.out.println(y);
	
    }
}
