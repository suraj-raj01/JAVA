// Q3. Write a program that accept a string and check for following:
// a. The string should have only 5 characters.
// b. The string should not have any special characters or alphabets
// except digits.
// If any of the condition does not matches appropriate error message
// should be displayed.

import java.util.Scanner;
public class str3 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        if(s.length()==5)
        {
            System.out.println("String have 5 character");
        }
        else{
            System.out.println("String should be 5 character");
        }
        char c[] = s.toCharArray();
        for(int i=0; i<c.length; i++)
        {
            if(c[i]>='1' && c[i]<='9')
            {
                System.out.print(c[i]);
            }
            else{
                System.out.println("String should be number!");
                break;
            }
        }
        sc.close();
    }
}
