/*
Replace a character at a specific index in a
String in Java

Examples of Replacing Characters in a String
Input: String = "Geeks Gor Geeks", index = 6, ch = 'F'
Output: "Geeks For Geeks."

Input: String = "Geeks", index = 0, ch = 'g'
Output: "geeks"
*/

import java.util.Scanner;

public class Q1 {
    public static void ReplaceChar(String s,int idx,char c)
    {
        s = s.substring(0,idx)+c+s.substring(idx+1);
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s = "Geeks Gor Geeks";
        int idx;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        idx = sc.nextInt();
        char ch = 'F';
        ReplaceChar(s,idx,ch);
        sc.close();
    }
}
