// Write a java Program to conver digit to number.

import java.util.Scanner;

public class digitToBinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int arr[] = new int[32];
		int i = 0;
		while (n > 0) {
			int r = n % 2;
			arr[i] = r;
			i++;
			n /= 2; // n = n/2;
		}
		System.out.print("Binary Number is: ");
		for (i = i - 1; i >= 0; i--) {
			System.out.print(arr[i] + "");
		}
		sc.close();
	}
}