// Write a Java Program to swap two numbers

class Swap{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c;
		System.out.println("Before swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}