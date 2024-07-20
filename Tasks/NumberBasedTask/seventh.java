/*
Q7.In cricket, 111 is known as Nelson number and a score
of 111 is considered as unlucky. It is named after Admiral
Nelson, who allegedly only had one arm, one leg and one
eye near the end of his life.
Multiple of 111 is also a Nelson number. These are known
as double Nelson for 222, triple Nelson for 333, quadruple
Nelson for 444 etc.
*/

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Nelson Number: ");
        n = sc.nextInt();
        for(int i=1; i<=15; i++)
        {
            if(111*i==n)
            {
                sum = n;
            }
        }
        if(sum==n)
        {
            System.out.println("Nelson Number!!");
        }
        else{
            System.out.println("Not a Nelson Number!!");
        }
        sc.close();
    }
}
