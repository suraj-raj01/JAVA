/*
Taking nothing and returning something.
Int java method can return onge value at a time.

 */
import java.util.Scanner;
public class method4 {
    public static int add()
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        c=a+b;
        sc.close();
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Sum is : "+add());
    }
}
