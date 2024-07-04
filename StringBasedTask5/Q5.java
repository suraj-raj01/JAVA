
/*
5.  Write a program in java to split string by space into words.
Test Data :
Input a string : this is a test string
Expected Output :
Strings or words after split by space are :
this
is
a
test
string
 */
public class Q5 {
    public static void splitString(String s) {
        String[] s1 = s.split(" ");
        for(int i=0; i<s1.length; i++)
        {
            System.out.println(s1[i]);
        }
    }
    public static void main(String[] args) {
        String s = new String("this is a test string");
        System.out.println("Strings or words after split by space are :");
        splitString(s);
    }
}
