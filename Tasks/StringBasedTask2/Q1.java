/*
1. Write a program that accepts an array by 10 names and display all
names that end with 'h'.
*/

import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0; i<n; i++)
        {
            s[i] = sc.nextLine();
        }
        System.out.println("h present in last");
        for(int i=0; i<n; i++)
        {
            if(s[i].endsWith("h"))
            {
                System.out.println(s[i]);
            }
        }
        sc.close();
    }
}