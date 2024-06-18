/*
4. Write a program in java to find maximum occurring character in a
string.
Test Data :
Input the string : Welcome to w3resource.com.
Expected Output :
The Highest frequency of character 'e'
appears number of times : 4
*/

public class Q4 {
    public static void main(String[] args) {
        String s = new String("Welcome to w3resource.com");
        for(int i=0; i<s.length(); i++)
        {
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println(s.charAt(i));
                }
            }
        }
    }
}
