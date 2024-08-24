import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disc "+n+" from "+src+" To "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disc "+n+" from "+src+" To "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        towerOfHanoi(n, "S", "H", "D");
        scanner.close();
    }
}

/*
Enter the number : 3
Transfer disc 1 from S To D
Transfer disc 2 from S To H
Transfer disc 1 from D To H
Transfer disc 3 from S To D
Transfer disc 1 from H To S
Transfer disc 2 from H To D
Transfer disc 1 from S To D
*/