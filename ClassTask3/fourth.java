/*
Q4. A triangular number is formed by the addition of consecutive integers starting with 1. For example,
1 + 2 = 3
1 + 2 + 3 = 6
1 + 2 + 3 + 4 = 10
1 + 2 + 3 + 4 + 5 = 15
Thus, 3, 6, 10, 15, are triangular numbers.
Write a program in Java to display all the triangular numbers from 3 to n, taking the value of n as an input. 
*/


import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n>=3)
        {
            int sum=3;
            System.out.println(sum);
            for(int i=3; i<=n; i++)
            {
                sum+=i;
                System.out.println(sum);
            }
        }
        else{
            System.out.println("Number should be greater than 3");
        }
        sc.close();
    }
}
