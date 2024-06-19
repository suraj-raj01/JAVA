/*
5. Write a java program to sort a string array in ascending order.
Test Data :
Input the string : w3resource
Expected Output :
After sorting the string appears like :
3ceeorrsuw
*/

class Q5 {
	public static void main(String args[]) {
		String s = new String("w3resource");
		System.out.println("original Data");
		System.out.println("w3resource");
		char ch[] =  s.toCharArray();

		for(int i=0; i<s.length(); i++)
		{
			for(int j=0; j<s.length(); j++)
			{
				if(ch[i]<ch[j])
				{
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}

		System.out.println("After sorting the string appears like :");
		for(int i=0; i<s.length(); i++)
		{
			System.out.print(ch[i]);
		}
	}
}