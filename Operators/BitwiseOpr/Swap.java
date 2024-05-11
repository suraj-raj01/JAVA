// WAP to swap two value without using third variable and arithmetic opr.

class Swap{
	public static void main(String args[]){
		int a,b;
		a = 10;
		b = 20;
		System.out.println("Before Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		// swap
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
