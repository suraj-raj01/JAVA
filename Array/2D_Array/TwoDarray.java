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
