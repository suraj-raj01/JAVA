// Check the Number even or odd.
// Taking nothing returning nothing
import java.util.Scanner;
class method2{
	
	public static void checkEven()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n = sc.nextInt();
	if(n%2==0)
	{
	System.out.println("Even Number");
	}
	else{
	System.out.println("Odd Number");
	}
	}
	public static void main(String args[])
	{
	checkEven();
	checkEven();
	}
}