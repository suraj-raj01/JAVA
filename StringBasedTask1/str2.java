// Q2. Write a program that accept a string and check for following:
// a. The string should have at least 3 characters.
// b. The string should not have any special characters or digits except
// alphabets.
// If any of the condition does not matches appropriate error message
// should be displayed.

// import java.util.Scanner;

// public class str2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String: ");
//         String s = sc.nextLine();
//         char c[] = s.toCharArray();
//         if (c.length > 3) {
//             System.out.print("The String is: ");
//             for (int i = 0; i < c.length; i++) {
//                 if (c[i] >= 'A' && c[i] <= 'Z' || c[i] >= 'a' && c[i] <= 'z') {
//                     System.out.print(c[i]);
//                 } else {
//                     System.out.println("\nString should be alphabet");
//                     break;
//                 }
//             }
//         } else {
//             System.out.println("String should be atleast 3 character");
//         }
//         sc.close();
//     }
// }

public class str2{
    public static void stringOpr(String s)
    {
        int count=0;
        if(s.length()<3)
        {
            System.out.println("String should be atleast 3 character");
            count++;
        }
        else if(s.length()>3)
        {
            for(int i=0; i<s.length(); i++)
            {
                char ch = s.charAt(i);
                if(!((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')))
                {
                    System.out.println("String have special character or Number");
                    count++;
                    break;
                }
            }
        }
        if(count==0)
        {
            System.out.println("Valid String");
        }
    }
    public static void main(String args[])
    {
        String s  = "SURAJ";
        stringOpr(s);
    }
}
