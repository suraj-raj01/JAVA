/*
Input: str = "hello", index = 3
Output: l
Input: str = "welcoME to bhopal", index = 6
Output: E
*/

import java.util.Scanner;
class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        char str[] = s.toCharArray();
        System.out.print("Enter the index for search element: ");
        int index = sc.nextInt();
        System.out.println(index+"th index element is : "+str[index]);
        sc.close();
    }
}