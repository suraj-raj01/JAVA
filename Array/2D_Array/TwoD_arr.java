import java.util.Scanner;
class TwoD_arr{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int[3][3];

	// for input data
	for(int i=0; i<3; i++)
	{
	for(int j=0; j<3; j++)
	{
	System.out.print("Enter the element index ["+i+","+j+"] : ");
	arr[i][j] = sc.nextInt();
	}
	}

	// for print data
	System.out.println();
	for(int i=0; i<3; i++)
	{
	for(int j=0; j<3; j++)
	{
	System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
	}	

	}
}

/*

Enter the element index [0,0] : 1
Enter the element index [0,1] : 4
Enter the element index [0,2] : 7
Enter the element index [1,0] : 8
Enter the element index [1,1] : 5
Enter the element index [1,2] : 2
Enter the element index [2,0] : 3
Enter the element index [2,1] : 6
Enter the element index [2,2] : 9

1       4       7
8       5       2
3       6       9

*/