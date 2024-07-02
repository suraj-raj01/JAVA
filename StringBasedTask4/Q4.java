/*
4. Write a program in java to remove characters in String Except
Alphabets.
Test Data :
Input the string : wel123come456india
Expected Output :
After removing the Output String : welcomeindia
*/
public class Q4 {
    public static void removeChar(String s)
    {
        char arr[] = s.toCharArray();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>='0'&&arr[i]<='9')
            continue;
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        String s = new String("wel123come456india");
        removeChar(s);
    }
}
