import java.util.Scanner;
class loop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++){
			System.out.println(i);
		}
	}
}