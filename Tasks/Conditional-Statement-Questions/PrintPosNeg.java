/*
5. Write a program to accept an integer from user and print positive, if the number is positive. Otherwise, print negative. Considering number can never be equal to zero.
*/

import java.util.Scanner;
public class PrintPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n>0){
        System.out.println("Positive Number!!!");
        }else{
        System.out.println("Negative number!!");
        }
        sc.close();
    }
}
