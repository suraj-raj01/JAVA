class Student{
    private int roll;
    private int age;
    private String name;
    public int getRoll()
    {
        return roll;
    }
    public void setRoll(int roll)
    {
        this.roll = roll;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Encap2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("Suraj");
        s.setRoll(66);
        System.out.println("Student name : "+s.getName());
        System.out.println("Student age : "+s.getAge());
        System.out.println("Student roll : "+s.getRoll());
    }
}

/*
Student name : Suraj
Student age : 20
Student roll : 66
*/