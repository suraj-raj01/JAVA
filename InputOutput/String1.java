import java.util.Scanner;

class String1{
	public static void main(String args[]){
		Scanner sk = new Scanner(System.in);

		System.out.println("Enter your Name: ");
		String name = sk.nextLine();
                System.out.println("Enter your section: ");
		char section = sk.next().charAt(0);
		System.out.println("Enter your Address: ");
		String address = sk.nextLine();


		System.out.println(name);
		System.out.println(section);
		System.out.println(address);
	}
}