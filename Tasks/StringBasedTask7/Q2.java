/*
Remove Leading Zeros From String in Java?
Example:

Input : 00000123569
Output: 123569
Input: 000012356090
Output: 12356090
*/
public class Q2 {
    public static void removeZero(String s)
    {
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]=='0')
            {
                continue;
            }
            System.out.print(ch[i]);
        }
    }
    public static void main(String[] args) {
        removeZero("00000123569");
    }
}
