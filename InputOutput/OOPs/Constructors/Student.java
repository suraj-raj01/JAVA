// Parameterized Cosntructors in java

public class Student {
    int roll;
    String name;
    int age;
    Student(int r, String n, int a)
    {
        roll = r;
        name = n;
        age = a;
    }
    void showData()
    {
        System.out.println("Roll no: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Student s = new Student(66, "SURAJ KUMAR",21);
        s.showData();
        Student s1 = new Student(50, "RAJAN KUMAR", 21);
        s1.showData();
    }
}

/*
Roll no: 66
Name: SURAJ KUMAR
Age: 21
Roll no: 50
Name: RAJAN KUMAR
Age: 21
*/
