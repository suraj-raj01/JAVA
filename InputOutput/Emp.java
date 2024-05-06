// Write a java program employee information from user

/*
Employee Name
Salary
Job Profile
Employee No.
Department No.
Grade
*/

import java.util.Scanner;
class Emp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		String empName = sc.nextLine();

		System.out.println("Enter Salary: ");
		float salary = sc.nextFloat();
		sc.nextLine();		

		System.out.println("Eneter Job Profile: ");
		String profile = sc.nextLine();

		System.out.println("Enter Emplyee No. : ");
		int empNo = sc.nextInt();

		System.out.println("Enter the Department No. : ");
		int departmentNo = sc.nextInt();

		System.out.println("Enter the Grade: ");
		char grade = sc.next().charAt(0);


		System.out.println("----------------------------");
		System.out.println("Employee Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("Job Profile: "+profile);
		System.out.println("Emplyee No. : "+empNo);
		System.out.println("Department No. : "+departmentNo);
		System.out.println("Grade: "+grade);
		System.out.println("----------------------------");
      		sc.close();
	}
}



/*
OUTPUT :-

Enter Employee Name:
SURAJ KUMAR
Enter Salary:
1200.35
Eneter Job Profile:
JAVA DEVELOPER
Enter Emplyee No. :
214
Enter the Department No. :
124
Enter the Grade:
A
----------------------------
Employee Name: SURAJ KUMAR
Salary: 1200.35
Job Profile: JAVA DEVELOPER
Emplyee No. : 214
Department No. : 124
Grade: A
----------------------------

*/