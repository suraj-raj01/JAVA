class A {
    protected void m1() {
        System.out.println("From Parent m1()");
    }

    protected void m2() {
        System.out.println("From Parent m2()");
    }
}

class B extends A {
    public void m1() {
        System.out.println("From Child m1()");
    }

    public void m2() {
        System.out.println("From Child m2()");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.m1();
        obj1.m2();
        A obj2 = new B();
        obj2.m1();
        obj2.m2();
    }
}

/*
  From Parent m1()
  From Parent m2()
  From Child m1()
  From Child m2()
 */