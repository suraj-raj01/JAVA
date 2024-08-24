// Write a java program to move all 'X' in the end of a string.

public class MoveXlast{
    public static void moveAllx(String s)
    {
        int size = s.length();
        char[] str = s.toCharArray();
        int l=0;
        for(int i=1; i<size; i++)
        {
            if(str[i]!='X' && str[i]!='x')
            {
                char temp = str[i];
                str[i] = str[l];
                str[l] = temp;
                l++;
            }
        }
        for(int i=0; i<size; i++)
        {
            System.out.print(str[i]);
        }
    }
    public static void main(String[] args) {
        String s = "sxkdxwxsxkx";
        moveAllx(s);
    }
}