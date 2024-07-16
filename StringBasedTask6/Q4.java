/*
Input: String : "Welcome to Bhopal"
Output: String[]: [Welcome to Bhopal]
Input: String : "A computer science portal"
Output: String[] : [A computer science portal]
*/

import java.util.Scanner;
public class Q4 {
    public void Formating(String s)
    {
        System.out.println("["+s+"]");
    }
    public static void main(String[] args) {
        Q4 obj = new Q4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        obj.Formating(s);
        sc.close();
    }
}
