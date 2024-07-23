/*
Java Program to Reverse a String using Stack?
Input: Hello World
Output: <- Reverse -> dlroW olleH
*/
public class Q3 {
    String str[] = new String[3];
    int top=-1;
    public void push(String s)
    {
        if(top==str.length-1)
        {
            System.out.println("Stack is full");
        }
        else{
            top++;
            str[top]=s;
        }
    }
    public void show()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        for(int i=str.length-1;i>=0;i--)
        {
            for(int j=str[i].length()-1;j>=0;j--)
            {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q3 q = new Q3();
        q.push("Hello World");
        q.push("Suraj Kumar");
        q.push("Welcome to Java");
        q.show();
    }
}

/*
avaJ ot emocleW
ramuK jaruS
dlroW olleH
*/