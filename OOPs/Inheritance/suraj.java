/*
Inheritance in Java Programming:-
Multilevel Inheritance

In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the 
derived class also acts as the base class for other classes. 
*/

class X {
    int a = 10;

    X() {
        System.out.println("This is X class Default Constructor");
    }

    public X(int a) {
        this.a = a;
        System.out.println("This is X class Parameterized Constructor");
    }
}

class Y extends X {
    int b = 20;

    Y() {
        System.out.println("This is Y class Default Constructor");
    }

    public Y(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("This is Y class Parameterized Constructor");
    }
}

class Z extends Y {
    int c = 30;

    Z() {
        System.out.println("This is Z class Default Constructor");
    }

    public Z(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("This is Z class Parameterized Constructor");
    }

    public void show() {
        System.out.println("This is X parent " + super.a);
        System.out.println("This is Y Child " + super.b);
        System.out.println("This is Z Child " + c);
    }
}

public class suraj {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.show();
    }
}
