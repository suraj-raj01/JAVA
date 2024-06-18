// 1. Write a java program to print multiplication of two matrix.



import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int r = sc.nextInt();
        System.out.print("Enter the size of column: ");
        int c = sc.nextInt();
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int mul[][] = new int[r][c];
        System.out.println("Enter elements of first Matrix: ");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("Enter elements of second Matrix: ");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }


        sc.close();
    }
}

