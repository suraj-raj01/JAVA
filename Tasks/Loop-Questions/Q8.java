/*
8. Write a program which accept a magic number form the user, print winner and stop if user 
entered magic number otherwise print try again. Also stop when user enter 0. In this 
particular question magic number is the question number. 
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the magic number: ");
            int magicNumber = sc.nextInt();
            if (magicNumber > 0) {
                if (magicNumber == 8) {
                    System.out.println("You Won!!");
                    break;
                } else {
                    System.out.println("try again");
                    continue;
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
