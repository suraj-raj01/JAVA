/*
6. Write a program to print all the odd number form 1 to 20. Hint check i % 2 != 0 and print i if it is odd.
*/
public class Q6 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
