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
    public static void SmallestLargest(String[] s) {
        String s1 = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > s[i + 1].length()) {
                s1 += s[i];
            }
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String[] s = { "It is a string with smallest and largest word" };
        SmallestLargest(s);
    }
}
