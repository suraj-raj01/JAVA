/*
Input : str = "welcometobhopal"
Output : w e l c o m e t o b h o p a l
Input : str = "RAM"
Output : R A M
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String s = sc.nextLine();
        String str[] = s.split("");
        for(int i=0; i<str.length; i++)
        {
            System.out.print(str[i]+" ");
        }
        sc.close();
    }
}
