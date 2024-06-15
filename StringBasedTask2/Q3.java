/*
3. Write a program in java to extract a substring from a given string. 
Test Data :
Input the string : this is test string
Input the position to start extraction :9
Input the length of substring :4
Expected Output :
The substring retrieve from the string is : "test";
*/

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        String str = new String(" this is test string");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the position to start extraction: ");
        int a = sc.nextInt();
        System.out.println("Enter the length of substring: ");
        int b = sc.nextInt();
        b+=a;
        sc.nextLine();
        System.out.println(str.substring(a,b));
        sc.close();
    }
}
