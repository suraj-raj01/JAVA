/*
1. Write a program in java to find the largest and smallest word in a
string.
Test Data :
Input the string : It is a string with smallest and largest word.
Expected Output :
The largest word is 'smallest';
and the smallest word is 'a';
*/

public class Q1 {
    public static void main(String[] args) {
        String s = "It is a string with smallest and largest word";
        String s1[] = s.split(" ");
        String largest="";
        for(int i=0; i<s1.length; i++)
        {
            for(int j=0; j<s1.length; i++)
            {
                if(s1[i].length()<s1[j+1].length())
                {
                    largest+=s1[i].length();
                }
            }
        }
        System.out.println(largest);
    }
}
