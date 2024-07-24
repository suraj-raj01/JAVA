/*
Swapping Pairs of Characters in a String in Java?
Input: str = "Java"
Output: aJav
Explanation: The given string contains even number of characters. Therefore,
we swap every pair of characters.
*/
public class Q5 {
    public String SwapPairs(String s)
    {
        char ch[] = s.toCharArray();
        if(s==null || s.isEmpty())
        {
           return s;
        }
        for(int i=0; i<ch.length; i+=2)
        {
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "JAVA";
        Q5 obj = new Q5();
        System.out.println(obj.SwapPairs(s));
    }
}
