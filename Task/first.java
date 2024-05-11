package JAVA.Task;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int sec = sc.nextInt();
        int hour = sec/60;
        int min = hour/60;
        int secs = min/60;
        System.out.println("H:M:S "+hour+" "+min+" "+secs);
        sc.close();
    }
}
