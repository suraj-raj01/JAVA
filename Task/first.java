/*
1. Write a Java program to convert a given integer (in seconds) to hours, minutes andseconds.
Test Data :
Input seconds: 25300Expected
Output:
There are:
H:M:S - 7:1:40 
*/

import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int sec = sc.nextInt();
        int hour = sec/3600;
        int min = (sec-(3600*hour))/60;
        int secs = (sec-(3600*hour))-(min*60);
        System.out.println("H:M:S - "+hour+":"+min+":"+secs);
        sc.close();
    }
}
