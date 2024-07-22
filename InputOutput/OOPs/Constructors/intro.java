/*

What is Constructor:
Constructor is a special type of function it is automatically called when an 
object is created.
Rules of Constructors:
1). Class name and constructor name must be same.
2). Constructor does not have any return type even void.
3). Constructor is automatically called when object is created.
*/

// Default Constructor

class intro{
    int a;
    int b;
    intro(){
        a = 10;
        b = 20;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        intro i = new intro();
    }
}