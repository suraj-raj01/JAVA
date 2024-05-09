class A{
	public static void main(String args[]){
		int a,b,c;
		a = 10;
		b = 20;
		c = a++ + ++b;
		System.out.println("c : "+c);
		System.out.println("a : "+a);
		System.out.println("b : "+b);

		a = 10;
		b = 20;
		c = b-- - --a;
		System.out.println("c : "+c);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}