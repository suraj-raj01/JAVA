/*
Q4. Write a program to calculate average and Percentage
of the Students
Enter marks out of 100
Enter marks of math=45
Enter marks of English=68
Enter marks of science=78
Enter marks of art=48
Enter marks of computer=78
Total marks out of 500=317
Percent of marks=63
*/

import java.util.Scanner;

class fourth{
    public static void main(String[] args) {
        int math,English,science,art,computer;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the math marks: ");
        math = sc.nextInt();
        System.out.print("Enter the English Marks: ");
        English = sc.nextInt();
        System.out.print("Enter the science Marks: ");
        science = sc.nextInt();
        System.out.print("Enter the art Marks: ");
        art = sc.nextInt();
        System.out.print("Enter the computer Marks: ");
        computer = sc.nextInt();
        int obtain = math+English+science+art+computer;
        float perc = (float)(math+English+science+art+computer)/5;
        System.out.println("Total Marks out of 500: "+obtain);
        System.out.println("Percentage of Marks: "+perc);
        sc.close();
    }
}