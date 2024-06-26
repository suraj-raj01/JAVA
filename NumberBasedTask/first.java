/*
Q1. Write a program to find all narcissistic numbers between 1 and 1000.
In number theory, a narcissistic number is a number that is the sum of its
own digits each raised to the power of the number of digits.
For example:
153 = 13 + 53 + 33
Expected Output
1
2
3
4
5
6
7
8
9
153
370
371
407
*/

import java.util.Scanner;
class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int t =n;
        int sum=0;
        while(n!=0)
        {
	   	if(n<10)
		{
		System.out.println(n);
		n--;
		}
	   else if(n>10 && n<1000){
            	int r = n%10;
		sum+=r*r*r;
            	n/=10;
		}
        }
        System.out.println(sum);
        sc.close();
    }
}
