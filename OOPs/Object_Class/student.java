/*
Q1. Write a java program to create student class and perform following operations?
import java.util.Scanner;
class Student{
String name;
String enroll;
float per;
int rollno;
char section;
int p;
int c;
int m;

int e;
int h;
*/
import java.util.Scanner;
public class student {
    String name;
    String enroll;
    float per;
    int rollno;
    char section;
    int p;
    int c;
    int m;
    int e;
    int h;
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name: ");
        name = sc.nextLine();
        System.out.println("Enter teh enrollment No. : ");
        enroll = sc.nextLine();
        System.out.println("Enter the roll no: ");
        rollno = sc.nextInt();
        System.out.println("Enter the Sections: ");
        section = sc.next().charAt(0);
        System.out.println("Enter Math marks: ");
        m = sc.nextInt();
        System.out.println("Enter Physics marks: ");
        p = sc.nextInt();
        System.out.println("Enter English marks: ");
        e = sc.nextInt();
        System.out.println("Enter Chemistry marks: ");
        c = sc.nextInt();
        System.out.println("Enter Hindi marks: ");
        h = sc.nextInt();
    }
    public void getPer()
    {
        per = (m+p+e+c+h)/5;
        System.out.println("Total marks: "+(m+p+e+c+h));
        System.out.println("Percentage: "+per);
    }
    public static void main(String[] args) {
        student s = new student();
        System.out.println("Student Data: ");
        s.getData();
        System.out.println("Total Marks & Percentage:");
        s.getPer();
    }
}
