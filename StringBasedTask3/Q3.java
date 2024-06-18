/*
3. Write a program in Java to count total number of vowel or consonant
in a string.

Test Data :
Input the string : Welcome to w3resource.com
Expected Output :
The total number of vowel in the string is : 9
The total number of consonant in the string is : 12
*/

public class Q3 {
    public static void main(String[] args) {
        int vowel=0;
        int consonant=0;
        String s = new String("Welcome to w3resource.com");
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowel++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                continue;
            }
            else if(s.charAt(i)=='.')
            {
                break;
            }
            else{
                consonant++;
            }
        }
        System.out.println("The total number of vowel in the string is : "+vowel);
        System.out.println("The total number of consonant in the string is : "+consonant);
    }
}
