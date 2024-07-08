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
    public String sum(String s,String k)
    {
        return s+k;
    }
    public double sum(double a, double b)
    {
        return a+b;
    }
    public float sum(float a, float b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println("sum is: "+obj.sum(10,20));
        System.out.println("sum is: "+obj.sum(10, 20, 30));
        System.out.println("Name Concate : "+obj.sum("SURAJ"," KUMAR"));
        System.out.println("Sum is: "+obj.sum(5.325, 256.354));
        System.out.println("Sum is: "+obj.sum(2.65f, 45.3f));
    }
}
