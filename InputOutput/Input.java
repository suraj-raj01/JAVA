import java.util.Scanner;
class Input{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		System.out.print("Sum is: ");
		System.out.println(a+b);
	}
}