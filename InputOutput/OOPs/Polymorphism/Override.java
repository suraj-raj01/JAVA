/*
Overriding:-
In java method overriding is a features that allows a sub class or childclass to 
provide a specific implementation of a method that is already defined in Parent class. 
When a method in a sub class has the same name, same return type, same argument (type)
*/

class Parent{
    public void show()
    {
        System.out.println("This is parent class!!");
    }
}
class Child extends Parent{
    public void show()
    {
        System.out.println("This is Child Classs!!");
    }
}
class Override {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
        Parent obj1 = new Parent();
        obj1.show();
    }
}

/*
This is Child Classs!!
This is parent class!!
*/