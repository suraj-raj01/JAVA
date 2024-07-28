/*
12. Write a program to accept birth year of user in YYYY format (like 1983) and print the chinese zodiac of the user.

Chinese zodiac is represented by an animal sign as follows:
0: monkey
1: rooster
2: dog
3: pig
4: rat
5: ox
6: tiger
7: rabbit
8: dragon
9: snake
10: horse
11: sheep
To get the corresponding value modulo-division year by 12
*/

import java.util.Scanner;

public class PrintChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Birth_Year(YYYY) : ");
        int birthYear = sc.nextInt();
        birthYear%=12;
        switch (birthYear) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2: 
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Snake");
                break;
            case 9:
                System.out.println("Horse");
                break;
            case 10:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Invalid!!!");
                break;
        }
        sc.close();
    }
}

/*
Enter the Birth_Year(YYYY) : 
2005
Rooster
----------------------------
Enter the Birth_Year(YYYY) : 
2007
Pig
*/