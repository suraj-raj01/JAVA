public class Emp {
    String name;
    float salary;
    int departmentNo;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary = salary;
    }
    public int getDepart()
    {
        return departmentNo;
    }
    public void setDepart(int departmentNo)
    {
        this.departmentNo = departmentNo;
    }
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.setDepart(20);
        emp.setName("SURAJ");
        emp.setSalary(25000.00f);
        System.out.println("Emplyee Name: "+emp.getName());
        System.out.println("Emplyee Salary: "+emp.getSalary());
        System.out.println("Emplyee Department: "+emp.getDepart());
    }
}
