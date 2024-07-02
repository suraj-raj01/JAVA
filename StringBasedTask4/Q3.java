/*
3. Write a program in java to find the number of times a given word 'the'
appears in the given string.
Test Data :
Input the string : The string where the word the present more than once.
Expected Output :
The frequency of the word 'the' is : 3
*/

class Q3{
    public static void appears(String s)
    {
        String str[] = s.split(" ");
        int count=0;
        System.out.println(str.length);
        for(int i=0; i<str.length; i++)
        {
            for(int j=0; j<str.length; j++)
            {
                if(str[i].equalsIgnoreCase(str[j])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String s = new String("The string where the word the present more than once");
        appears(s);
    }
}