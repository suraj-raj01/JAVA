//Parameterized Constructor

public class Employee {
    String EmployeeName;
    float salary;
    String department;
    // Default Constructor
    public Employee()
    {
        System.out.println("Default Constructor is called: ");
        EmployeeName = "SURAJ KUMAR";
        salary = 25000.00f;
        department = "Backend Developer";
    }

    // Parameterized Constructor
    public Employee(String n,float s, String d)
    {
        System.out.println("Parameterized Constructor is called: ");
        n = EmployeeName;
        s = salary;
        d = department;
    }

    void showData()
    {
        System.out.println("Emplyee name: "+EmployeeName);
        System.out.println("Emplyee salary: "+salary);
        System.out.println("Emplyee department: "+department);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.showData();
    }
}
