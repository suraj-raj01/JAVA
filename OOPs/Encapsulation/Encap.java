/* 
Encapsulation in java Programming.

Encapsulation:-
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
To achieve this, you must:

1. declare class variables/attributes as private
2. provide public get and set methods to access and update the value of a private variable
*/

class Main {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encap{

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.setAge(20);
        myObj.setName("suraj");
        System.out.println("Student Name: "+myObj.getName());
        System.out.println("Student Age: "+myObj.getAge());
    }
}

/*
Student Name: suraj
Student Age: 20
*/