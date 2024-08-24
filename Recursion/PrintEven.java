public class PrintEven {
    // print Even Numbers
    public static void printEven(int n) {
        if (n == 0) {
            System.out.print(n);
            return;
        }
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
        printEven(n - 1);
    }

    // print Odd Numbers
    public static void printOdd(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        if(n%2!=0){
            System.out.print(n+" ");
        }
        printOdd(n-1);
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.print("Even Numbers : ");
        printEven(n);
        System.out.println();
        System.out.print("Odd Numbers : ");
        printOdd(n);
    }
}

/*
Even Numbers : 20 18 16 14 12 10 8 6 4 2 0
Odd Numbers : 19 17 15 13 11 9 7 5 3 1
*/