/*
Q4. Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3

Expected Output :
43
1
19
13
*/


class Q4{
	public static void main(String args[]){
		int a,b,c,d;
		a = -5+8*6;
		b = (55+9)%9;
		c = 20+-3*5/8;
		d = 5+15/3*2-8%3;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
	}
}