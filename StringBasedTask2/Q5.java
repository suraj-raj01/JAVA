/*
5.  Write a program in java to count the total number of words in a string. 
Test Data :
Input the string : welcome to bhopal
Expected Output :
Total number of words in the string is : 3
*/

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strign: ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        System.out.println("Total number of words in the string is : "+arr.length);
        sc.close();
    }
}
