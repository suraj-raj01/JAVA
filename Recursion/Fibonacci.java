public class Fibonacci {
    public static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibonacci(b,c,n-1);
    }
    public static void main(String[] args) {
        int t = 10;
        int a,b;
        a = 0;
        b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibonacci(a, b, t-2);
    }
}