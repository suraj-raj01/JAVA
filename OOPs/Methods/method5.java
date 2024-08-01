// Taking something and returning something.

import java.util.Scanner;

public class method5 {
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the first number: ");
        int b = sc.nextInt();
        int res = add(a, b);
        System.out.println("Sum is : "+res);
        sc.close();
    }
}
