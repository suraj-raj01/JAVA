class Person{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
public class Encap1{
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        p.setName("Suraj");
        System.out.println("Student name is: "+p.getName());
        System.out.println("Student age is: "+p.getAge());
    }
}

/*
Student name is: Suraj
Student age is: 20
*/