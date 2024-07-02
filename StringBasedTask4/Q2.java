/*
2. Write a program in java to read a sentence and replace lowercase
characters by uppercase and vice-versa. 
Test Data :
Input the string : This Is A Test String.
Expected Output :
The given sentence is : This Is A Test String.
After Case changed the string is: tHIS iS a tEST sTRING.
*/

class Q2{

    public static void toggle(String s)
    {
        String str[] = s.split(" ");
        for(int i=0; i<str.length; i++)
        {
            System.out.print(str[i]+" ");
            if(str[i].charAt(i)>=65 && str[i].charAt(i)<=90)
            {
                
            }
        }
    }
    public static void main(String[] args) {
        String s = "this is a string";
        toggle(s);
    }
}