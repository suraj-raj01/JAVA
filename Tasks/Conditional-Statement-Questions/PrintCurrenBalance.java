/*
9. Write a program that print the current balance of the account, ask the user to enter the withdrawal amount.

if withdrawal amount is less than current balance,
deduct the withdrawal amount form the current balance, if current balance after deduction is less than 500 INR, deduct penalty of 50 INR and print current balance and penalty.
otherwise, print the current balance.
If withdrawal amount is greater than current balance, print insufficient funds.
Sample run 1
Current balance = 5000
Enter withdrawal amount - 4600
Current balance = 350
Penalty = 50

Sample run 2
Current balance = 5000
Enter withdrawal amount - 4500
Current balance = 500

Current balance = 5000
Enter withdrawal amount - 5600
insufficient funds
*/

import java.util.Scanner;

public class PrintCurrenBalance {
    public static void main(String[] args) {
        int currentAmount = 5000;
        int withdrawal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withedrawal amount: ");
        withdrawal = sc.nextInt();
        if(currentAmount<withdrawal)
        {
            System.out.println("insufficient funds");
        }
        else if(withdrawal<currentAmount)
        {
            currentAmount-=withdrawal;
            if(currentAmount<500)
            {
                currentAmount-=50;
                System.out.println("Penalty: "+50);
            }
            System.out.println("Current balance : "+currentAmount);
        }
        sc.close();
    }
}

/*
Enter the withedrawal amount: 
4600
Penalty: 50
Current balance : 350
----------------------------
Enter the withedrawal amount: 
5600
insufficient funds
----------------------------
Enter the withedrawal amount: 
4000
Current balance : 1000
*/
