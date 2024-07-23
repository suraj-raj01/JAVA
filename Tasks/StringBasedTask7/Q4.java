
/*
Sort a String in Java

Input string : "axbycz"
Output string : "abcxyz"
Input: str = “GeeksForGeeks”
Output: No
*/
import java.util.Arrays;
public class Q4 {
    public static void SortString(String s) {
    char ch[] = s.toCharArray();
    Arrays.sort(ch);
    System.out.println(ch);
    }
    public static void main(String[] args) {
        SortString("axbycz");
    }
}
