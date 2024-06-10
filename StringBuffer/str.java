// Insert Method: insert method insert the given string with the specified position,
/*
Syntax:
StringBuffer insert(int position, String object)
*/

class str{
	public static void main(String args[])
	{
	StringBuffer s = new StringBuffer("Welcome Bhopal");
	System.out.println("before insert : "+s);
	s.insert(8,"To ");
	System.out.println("after insert : "+s);

	/*
	StringBuffer class 
	replace method(): remplace the given string from the specified 
	string(from index to endIndex)
	Syntax:
	
	
	*/

	/*
	StringBuffer s1 = new StringBuffer("Welcome");
	System.out.println("before replace : "+s1);
	
	for(int i=0; i<s1.length(); i++)
	{
	char c = s1.charAt(i);
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	{
		s1.replace(i,i+1,"b");
	}
	}
	System.out.println("after replace : "+s1);
	s1.replace(3,7,"done");
	System.out.println("again after replace : "+s1);
	*/

	StringBuffer s1 = new StringBuffer("Welcome");
	System.out.println("Before delete: "+s1);
	for(int i=0; i<s1.length(); i++)
	{
	char c = s1.charAt(i);
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	{
		s1.delete(i,i+1);
	}
	}
	System.out.println("after delete vowel character : "+s1);

	/*
	StringBuffer class Delete Method(): it delete the string from first index to endIndex
	StringBuffer delete(idx start, idx last)
	*/	
	
	StringBuffer s2 = new StringBuffer("Welcome");
	System.out.println("Befoer Delete: "+s2);
	s2.delete(0,7);
	System.out.println("After Delete: "+s2);
	
	// charAt()
	StringBuffer s3 = new StringBuffer("Welcome");
	System.out.println("Before Delete: "+s3);
	s3.deleteCharAt(2);
	System.out.println("after deleting 2nd Index : "+s3);

	// StringBuffer class Reverse method():
	// it is used to reverse a string
	
	StringBuffer s4 = new StringBuffer("Welcome");
	System.out.println("Before Reverse: "+s4);
	s4.reverse();
	System.out.println("After Reverse: "+s4);
	}
}