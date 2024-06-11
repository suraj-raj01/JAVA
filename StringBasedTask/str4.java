// 4. Write a program that accepts a string and check for following:
// a. The string should have at least 6 characters.
// b. The string should not have any special characters except @.
// If any of the condition does not matches appropriate error message
// should be displayed.


import java.util.Scanner;
public class str4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        if(s.length()>=6)
        {
          
        char c[] = s.toCharArray();
        for(int i=0; i<c.length; i++)
        {
            if(c[i]=='#'|| c[i]=='!' || c[i]=='$' || c[i]=='%' || c[i]=='&'){
                System.out.println("\nSpecial Character used");
                break;
            }
            else{
                System.out.print(c[i]);
            }
        }
    }else{
        System.out.println("String should be atleast 6 character");
    }
        sc.close();
    }
}