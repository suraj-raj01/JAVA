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
        char ch[] = s.toCharArray();
        int t=0;
        char p=' '; 
        for(int i=0; i<s.length(); i++)
        {
            int c=0;
            for(int j=1; j<s.length(); j++)
            {
                if(ch[i]==ch[j])
                {
                    c++;
                }
            }
            if(t<c)
            {
                t=c;
                p = ch[i];
            }
        }
        System.out.println("Character is : "+p);
        System.out.println("Character comes "+t+" times");
    }
}
