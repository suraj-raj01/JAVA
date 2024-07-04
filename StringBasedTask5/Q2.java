/*
2.  Write a program in java to convert a string to uppercase without using
pre-defined function  
Test Data :
Input a string in lowercase : the quick brown fox jumps over the lazy dog
Expected Output :
Here is the above string in UPPERCASE :
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
*/
public class Q2 {
    public static void main(String[] args) {
        String s = new String("the quick brown fox jumps over the lazy dog");
        String[] s1 = s.split(" ");
        for(int i=0; i<s1.length; i++)
        {
            System.out.print(s1[i].toUpperCase()+" ");
        }
    }
}
