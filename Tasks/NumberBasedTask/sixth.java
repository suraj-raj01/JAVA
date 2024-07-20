
/*
Q6. Voting Age Program
A person can votes if age is greater than or equal to 18.
Output:
Enter your age=19
You are eligible for vote.
*/

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are Eligible for Vote.");
        }
        else{
            System.out.println("You are not Eligible for Vote");
        }
        sc.close();
    }
}
