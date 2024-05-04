import java.util.Scanner;
class Input2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Name: ");
		String str = sc.next();
		System.out.print("Enter Last Name: ");
		String str1 = sc.next();
		System.out.print("Full Name: ");
		System.out.print(str+" "+str1);
	}
}