// CompareToMethod

class cmpTo{
	public static void main(String args[])
	{
		String str1 = new String("ABC");
		String str2 = new String("abc");
		
		int s1 = str1.compareTo(str2);
		System.out.println(s1);

		int s2 = str2.compareTo(str1);
		System.out.println(s2);
		System.out.println(str1.compareTo(str2));

		// int s3 = str1.equals(str2);
		// System.out.println(s3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		String a = "SURAJ";
		String b = "SURAJ";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
	}
}