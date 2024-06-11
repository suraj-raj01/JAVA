// 5. Write a program that accepts an array by 10 names and display all
// names that start with A.

import java.util.Scanner;
public class str5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[10];
        for(int i=0; i<10; i++)
        {
            s[i] = sc.nextLine();
        }
        for(int i=0; i<10; i++)
        {
            String str[] = s[i].split(" ");
            if(str[0]=="B"){
                System.out.println(s[i]);
            }
        }
        sc.close();
    }
}
