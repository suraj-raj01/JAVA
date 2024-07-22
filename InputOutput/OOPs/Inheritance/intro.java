/*
Explain Inheritance in java programming?
Ans: Passing properties from one class into another classProperties may be member data 
and member function
In case of inheritance member data should not be private

Java Does not support multiple inheritance through the class
Java Does not support Operator overloading
Java Does not support inline function
Java Does not support friend function
Java does not support virtual or pure virtual function

Explain super keyword in java
programming?
Ans: super keyword always represent
parent class
There are three use of super keyword in
java
1. To access Parent class member data
from the child class
Syntax:
super.memberDataName

2. Using super we call Parent class
constructor from the child class
Note: super is a first statement of any
constructor or methods
super();//call default constructor of
Parent class
super(a,b)

3. Super is also used to call Parent class
method from the child class
*/
class A{
    int x = 10;
    A()
    {
        System.out.println("Class A Default Constructor");
    }
}
class B extends A{
    int y = 20;
    B()
    {
        System.out.println("Class B Default Constructor");
    }
    public void show()
    {
        System.out.println("Class B extends A");
        System.out.println("class A data "+super.x);
        System.out.println("Class B data "+y);
    }
}
class intro{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}