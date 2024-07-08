import java.util.Scanner;
class method1{

	
	public static void add()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int a = sc.nextInt();
	System.out.print("Enter the second number: ");
	int b = sc.nextInt();
	int sum = a+b;
	System.out.println("Addition is: "+sum);
	sc.close();
	}
	public static void main(String args[])
	{
	add();
	add();
	add();
	}
}