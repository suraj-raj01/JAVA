import java.util.Scanner;

public class SumOfN {
    public static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfN(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n Natural number : ");
        int n = scanner.nextInt();
        System.out.println(sumOfN(n));
        scanner.close();
    }
}
