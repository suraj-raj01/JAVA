public class arr1 {
    public static void main(String[] args) {
        System.out.println("Integer Type:"); 
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        for(int i=0; i<5; i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("\nCharacter Type: ");
        char c[] = new char[5];
        c[0] = 'A';
        c[1] = 'B';
        c[2] = 'C';
        c[3] = 'D';
        c[4] = 'E';
        for(int i=0; i<5; i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println("\nString Type:");
        String s[] = new String[5];
        s[0] = "SURAJ";
        s[1] = "RAJAN";
        s[2] = "HARIOM";
        s[3] = "BITTU";
        s[4] = "RAHUL";
        for(int i=0; i<5; i++)
        {
            System.out.print(s[i]);
            if(i<4)
            {
                System.out.print(" : ");
            }
        }
    }
}
