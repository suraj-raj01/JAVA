class Person{
    private String name;
    private int age;
    private String address;
    public void getData()
    {
        System.out.println("Persong name: "+name);
        System.out.println("Person age: "+age);
        System.out.println("Person address: "+address);
    }
    public void setData(int age, String name, String address){
        this.age = age;
        this.name = name;
        this.address = address;
    }
}

public class Encap3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setData(10, "SURAJ", "BHOPAL");
        System.out.println("Person Data");
        p.getData();
    }
}

/*
Person Data
Persong name: SURAJ
Person age: 10
Person address: BHOPAL
*/