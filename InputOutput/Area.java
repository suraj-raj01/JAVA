// Write a Java Program to calculate area and pirameter of rectangle.

import java.util.Scanner;
class Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l,w,ar,pr;
		System.out.print("Enter the height: ");
		l = sc.nextInt();
		System.out.print("Enter the width: ");
		w = sc.nextInt();
		
		ar = l*w;
		pr = 2*(l+w);

		System.out.println("Area of Rectangle: "+ar);
		System.out.print("Pirameter of rectangle: "+pr);
	}
}