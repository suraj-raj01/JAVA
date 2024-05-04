import java.util.Scanner;
class Circle{
	public static void main(String args[]){
		float r,ar,cr;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		r = sc.nextFloat();
		ar = 3.14f*r*r;
		cr = 2*3.14f*r;
		System.out.println("Area of Circle: "+ar);
		System.out.print("Area of Circumference: "+cr);
	}
}
		