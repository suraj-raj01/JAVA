class A{
    int X;
    public A()
    {
        X=10;
    }
    public final void show1()
    {
        System.out.println("This is Parent class X : "+X);
    }
}
class B extends A{
    int Y;
    public B()
    {
        Y = 30;
    }
    void show()
    {
        System.out.println("This is Child Class B : "+Y);
    }
}

public class finalClass1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.show1();
    }
}
