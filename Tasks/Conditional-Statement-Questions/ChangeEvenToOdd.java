/*
7. Write a program to accept an integer from user. If the number is even make it odd and print. If the number is odd make it even and print.
*/

import java.util.Scanner;

public class ChangeEvenToOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            n++;
            System.out.println(n+" is Odd number!!");
        }
        else{
            n--;
            System.out.println(n+" is Even number!!!");
        }
        sc.close();
    }
}
