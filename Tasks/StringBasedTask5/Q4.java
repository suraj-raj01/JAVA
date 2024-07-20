/*
4. Write a program in java to replace the spaces of a string with a specific
character.

Test Data :
Input a string :Be glad to see the back of
Input replace character : *
Expected Output :
After replacing the space with * the new string is :
Be*glad*to*see*the*back*of*
*/
public class Q4 {
    public static void replace(String s)
    {
        char ch='*';
        String str = s.replace(' ', ch);
        System.out.println(str);
    }
    public static void main(String[] args) {
        String s = "Be glad to see the back of";
        System.out.println("Before replacing:");
        System.out.println(s);
        System.out.println("After replacing:");
        replace(s);
    }
}
