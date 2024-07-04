/*
3. Write a program in java to find the number of times a given word 'the'
appears in the given string.
Test Data :
Input the string : The string where the word the present more than once.
Expected Output :
The frequency of the word 'the' is : 3
*/

class Q3 {
    public static void main(String[] args) {
        String s = new String("The string where the word the present more than once");
        String s1[] = s.split(" ");
        int count=0;
        for(int i=0; i<s1.length; i++)
        {
            if(s1[i].equalsIgnoreCase("the"))
            {
                count++;
            }
        }
        System.out.println("The frequency of the word 'the' is : "+count);
    }
}