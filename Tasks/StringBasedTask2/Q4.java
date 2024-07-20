/*
4. Write a program in java to print individual characters of string in reverse
order. 
Test Data :
Input the string : welcome
Expected Output :
The characters of the string in reverse are :
emoclew 
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        for(int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
