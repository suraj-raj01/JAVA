/*
Method Overloading in java Programming:
Method overloading is a key concept of OOPs. Method overloading means having two or more
method in a class with the same name but different type or different number of parameters.
*/
public class Overloading {
    int a=20;
    int b=30;
    Overloading()
    {
        int c = a+b;
        System.out.println("sum is: "+c);
    }
    public int sum(int a, int b)
    {
        return a+b;
    }
    public int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public String data(String s)
    {
        return s;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println("sum is: "+obj.sum(10,20));
        System.out.println("sum is: "+obj.sum(10, 20, 30));
        System.out.println("Name : "+obj.data("SURAJ KUMAR"));
    }
}
