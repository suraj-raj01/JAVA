/*
Q5. Given the Cost Price(CP) and Selling Price(SP) of a
product. The task is to Calculate the Profit or Loss.
Examples:

Input: CP = 1500, SP = 2000
Output: 500 Profit

Input: CP = 3125, SP = 1125
Output: 2000 Loss

Formula:

Profit = (Selling Price - Cost Price)
Loss = (Cost Price - Selling Price)
*/

import java.util.Scanner;

public class fifth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double CP,SP;
        System.out.println("Enter the Cost Price: ");
        CP = sc.nextDouble();
        System.out.println("Enter the Selling Price: ");
        SP = sc.nextDouble();
        if(SP>CP)
        {
            System.out.println("Profit: "+(SP-CP));
        }
        else{
            System.out.println("Loss: "+(CP-SP));
        }
        sc.close();
    }
}