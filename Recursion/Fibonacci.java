import java.util.Scanner;

public class Fibonacci{
    public static void printFibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        /*

        a = b;
        b = c;
        printFibonacci(a, b, n-1);

        */
        printFibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Terms");
        n = scanner.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        printFibonacci(a, b, n-2);
        scanner.close();
    }
}