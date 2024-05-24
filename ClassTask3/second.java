/*
Q2. A Composite Magic number is a positive integer which is composite as well as a magic number.

Composite number: A composite number is a number which has more than two factors.
For example:
Factors of 10 are: 1, 2, 5, 10

Magic number: A Magic number is a number in which the eventual sum of the digit is equal to 1.
For example: 28 = 2+8=10= 1+0=1

Accept two positive integers 'm' and 'n', where m is less than n. Display the number of composite magic integers that are in the range between m and n (both inclusive) and output them along with frequency, in the format specified below:

Sample Input:
m=10 n=100
Output: The composite magic numbers are 10,28,46,55,64,82,91,100
Frequency of composite magic numbers: 8

Sample Input:
m=120 n=90
Output: Invalid input
*/

import java.util.Scanner;

class second {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum,k,t;
		while (n!=m) {
			sum = 0;
			k = 0;
			t = n;
			
			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}

			while (sum != 0) {
				k += sum % 10;
				sum /= 10;
			}
			if (k == 1) {
				System.out.println(t);
				break;
			} else {
				System.out.println("It is not a Magic number");
			}
			n++;
		}
	}
}
