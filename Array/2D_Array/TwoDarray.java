/*
public class TwoDarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 2;
        arr[0][1] = 1;
        arr[0][2] = 3;
        arr[1][0] = 8;
        arr[1][1] = 8;
        arr[1][2] = 7;
        arr[2][0] = 1;
        arr[2][1] = 8;
        arr[2][2] = 6;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
*/

/*
public class TwoDarray{
	public static void main(String args[])
	{
	int arr[][] = {
	{4,7,8},
	{6,4,2},
	{9,2,7}
	};

	System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]);
	System.out.println(arr[1][0]+" "+arr[1][1]+" "+arr[1][2]);
	System.out.println(arr[2][0]+" "+arr[2][1]+" "+arr[2][2]);
	}
}
*/

import java.util.Scanner;
class TwoDarray{
public static void main(String args[]){
int A[][]=new int[3][3];
Scanner obj=new Scanner(System.in);
System.out.println("Enter Element Index of 00 : ");
A[0][0]=obj.nextInt();
System.out.println("Enter Element Index of 01 : ");
A[0][1]=obj.nextInt();
System.out.println("Enter Element Index of 02 : ");
A[0][2]=obj.nextInt();

System.out.println("Enter Element Index of 10 : ");
A[1][0]=obj.nextInt();
System.out.println("Enter Element Index of 11 : ");
A[1][1]=obj.nextInt();
System.out.println("Enter Element Index of 12 : ");
A[1][2]=obj.nextInt();

System.out.println("Enter Element Index of 20 : ");
A[2][0]=obj.nextInt();
System.out.println("Enter Element Index of 21 : ");
A[2][1]=obj.nextInt();
System.out.println("Enter Element Index of 22 : ");
A[2][2]=obj.nextInt();

System.out.println(A[0][0]+"\t"+A[0][1]+"\t"+A[0][2]);
System.out.println(A[1][0]+"\t"+A[1][1]+"\t"+A[1][2]);
System.out.println(A[2][0]+"\t"+A[2][1]+"\t"+A[2][2]);
obj.close();
}
}