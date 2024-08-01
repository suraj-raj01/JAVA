/*
Q2. Write a java program to create a employee class and
perform some basic operations
Basic Salary : 25000
HRA : BASIC SALARY * 20% = 5000
DA: BASIC SALARY * 10%= 2500
TA: BASIC SALARY *10%=2500
Total INCENTIVE: HRA+DA+TA=5000+2500+2500=10000
Gross SALARY: BASIC SALARY + Total Incentive

25000+ 10000=35000
*/

import java.util.Scanner;

public class Employee {
    String EmplyeeName;
    int BasicSalary;
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee name: ");
        EmplyeeName = sc.nextLine();
        System.out.println("Enter the Basic Salary: ");
        BasicSalary = sc.nextInt();
        float HRA = (BasicSalary*0.2f);
        float DA = (BasicSalary*0.1f);
        float TA = (BasicSalary*0.1f);
        float TotalIncentive = (HRA+DA+TA);
        float GrossSalary = BasicSalary+TotalIncentive;
        System.out.println("Basic Salary: "+BasicSalary);
        System.out.println("Total Incentive: "+TotalIncentive);
        System.out.println("Gross Salary: "+GrossSalary);
        sc.close();
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
    }
}
