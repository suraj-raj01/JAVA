// Pre Increment Pre Decrement

class Pre{
	public static void main(String args[]){
		int a,b;
		a = 10;
		b = ++a;
		System.out.println("a : "+a);   // 11  
		System.out.println("b : "+b);   // 11

		a = 10;
		b = --a;
		System.out.println("a : "+a);	// 9
		System.out.println("b : "+b);	// 9
	}
}