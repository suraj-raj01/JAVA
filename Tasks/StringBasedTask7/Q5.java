/*
Check if a given string is Pangram in Java?
A string is a pangram string if it contains all the character of
the alphabets ignoring the case of the alphabets.

Examples:
Input: str = "Abcdefghijklmnopqrstuvwxyz"
Output: Yes
Explanation: The given string contains all the letters from a to z
(ignoring case).

Input: str = "WelcomeToBhopal"
Output: No
*/
public class Q5 {
    public static void Pangram(String sentence) {
        if(sentence.equalsIgnoreCase("abcdefghijklmnopqrstuvwxyz")) {
            System.out.println("Pangram");
        }
        else {
            System.out.println("Not Pangram");
        }
    }
    public static void main(String[] args) {
        Pangram("abcdefghijklmnopqrstUvwxyZ");
    }
}
