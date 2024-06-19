// 2. Write a java program to print row byes sum and column byes sum.

import java.util.Scanner;

public class row_col_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int r = sc.nextInt();
        System.out.print("Enter the size of column: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int rsum=0;
        int csum=0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                rsum+=arr[i][j];
                csum+=arr[j][i];
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("[Row Sum:  "+rsum+"] [Column Sum: "+csum+"]");
            rsum=0;
            csum=0;
        }
        sc.close();
    }
}
