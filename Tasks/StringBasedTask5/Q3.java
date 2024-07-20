/*
3. Write a program in java to convert a string to lowercase without using
pre-defined function
Test Data :
Input a string in UPPERCASE : THE QUICK BROWN FOX JUMPS
OVER THE LAZY DOG.
Expected Output :
Here is the above string in lowercase :
the quick brown fox jumps over the lazy dog.
*/
public class Q3 {
    public static void main(String[] args) {
        String s = new String("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        String[] s1 = s.split(" ");
        System.out.println("In Lower Case:");
        for(int i=0; i<s1.length; i++)
        {
            System.out.print(s1[i].toLowerCase()+" ");
        }
    }
}
