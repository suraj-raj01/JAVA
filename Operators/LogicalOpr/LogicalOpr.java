/*
Logical Operators : 
Logical AND (&&)
Logical OR (||)
Logical NOT (!)

Note: Result of all logical operators are true or false.
*/

/*
// Logical AND (&&):-

class LogicalOpr{
	public static void main(String args[]){
		int a,b,c,d;
		a=10;
		b=20;
		c=30;
		d=40;
		boolean r=a<b && c>d;  
		boolean s =a<c && c<d;  
		System.out.println(r);  //false
		System.out.println(s);  //true

	}
}
*/

/*
// Logical OR(||):-

class LogicalOpr{
	public static void main(String args[]){
		int a,b,c,d;
		a=10;
		b=20;
		c=30;
		d=40;
		boolean r = a<b || c>d;
		boolean s = a>b || c<a;
		System.out.println(r); //true
		System.out.println(s); //false
	}
}
*/


//Logical Not(!):-

class LogicalOpr{
	public static void main(String args[]){
		int a,b,c,d;
		a=10;
		b=20;
		c=30;
		d=40;
		boolean r = !(a>b || a<d);
		boolean s = !(a>b || c>d);
		System.out.println(r);  //false
		System.out.println(s);  //true
	}
}












