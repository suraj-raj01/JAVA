// Non-Parameterized Constructors or Default Constructer

public class Emp {
    String name;
    float salary;
    String department;
    Emp()
    {
        name = "SURAJ";
        salary = 35000.00f;
        department = "Backend Developer";
    }
    void showData()
    {
        System.out.println("Emplyee name: "+name);
        System.out.println("Emplyee salary: "+salary);
        System.out.println("Emplyee department Name: "+department);
    }
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.showData();
    }
}
