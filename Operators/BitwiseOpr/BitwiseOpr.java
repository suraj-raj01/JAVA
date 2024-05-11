/*
We discuss following bitwise operator.
1.Bitwise AND(&)
2.Bitwise OR(|)
3.Bitwise XOR(^)
4.Bitwise NOT(~)
5.Bitwise lefShift(<<)
6.Bitwise rightShift(>>)
*/

/*
// Bitwise AND (&):-

class BitwiseOpr{
	public static void main(String args[]){
		int a,b,c;
		a = 7;
		b = 5;
		c = a&b;
		System.out.println(c);  // 5
	}
}
*/

/*
// Bitwise OR (|):-

class BitwiseOpr{
	public static void main(String args[]){
		int a,b,c;
		a = 9;
		b = 5;
		c = a|b;
		System.out.println(c);  // 7
	}
}
*/


// Bitwise XOR (^):- result of bitwise xor opr is 1 when both bits are 
// different fron each other.
/*
class BitwiseOpr{
	public static void main(String args[]){
		int a,b,c;
		a = 7;
		b = 5;
		c = a^b;
		System.out.println(c);  // 2
	}
}
*/

// Bitwise NOT(~):-
/*
class BitwiseOpr{
	public static void main(String args[]){
		int x = 10;
		System.out.println(~x);
	}
}
*/


// LeftShift Operator(<<):-

/*
class BitwiseOpr{
	public static void main(String args[]){
		int a,b;
		a = 4;
		System.out.println(a<<1);  	//8
		System.out.println(a<<2);  	//16
		System.out.println(a<<3);  	//32
		System.out.println(a<<4);  	//64
	}
}

*/


// RightShift Operator(>>):-

class BitwiseOpr{
	public static void main(String args[]){
		int a = 10;
		System.out.println(a>>1);	//5
		System.out.println(a>>2);	//2
		System.out.println(a>>3);	//1
		System.out.println(a>>4);	//0
	}
}




























