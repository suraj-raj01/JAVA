/*
2. Write a program that accepts an array by 10 names and display all
names that contain 'he'.
*/

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0; i<n; i++)
        {
            s[i] = sc.nextLine();
        }
        for(int i=0; i<n; i++)
        {
            if(s[i].contains("he"))
            {
                System.out.println(s[i]);
            }
        }
        sc.close();
    }
}
