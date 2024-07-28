/*
7. Write a program which accept a magic number form the user, print winner and stop if user entered magic number. In this particular question magic number is the question number. 
*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magicNumber;
        while(true)
        {
            System.out.println("Guess the magic number: ");
            magicNumber = sc.nextInt();
            if(magicNumber==7)
            {
                System.out.println("You Won!!!");
                break;
            }
            else{
                continue;
            }
        }
        sc.close();
    }
}
