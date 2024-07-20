/*
Q3. Write a program to print alternate number from 80 To 70.
80
skip
78
skip
76
skip
74
skip
72
skip
70

*/

class third{
	public static void main(String args[]){
		for(int i=80; i>=70; i--)
		{
		if(i%2==0)	
		{
		System.out.println(i);
		}
		else{
		System.out.println("skip");
		}
		}
	}
}

