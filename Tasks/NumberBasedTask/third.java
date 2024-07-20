/*
Q3. Menu Based Program in
1- Area of Right Triangle
2- Area of Equilateral Triangle
3- Area of Square
4- Area of Rectangle
5- Area of Circle
------------------------------
Select your choice=4
Enter l=4

Enter b=5
Area of Rectangle=20.0
*/

import java.util.Scanner;
class third{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operator to perform Task");
        System.out.println("1 -> Area of Right Triangle");
        System.out.println("2 -> Area of Equilateral Triangle");
        System.out.println("3 -> Area of Square");
        System.out.println("4 -> Area of Rectangle");
        System.out.println("5 -> Area of Circle");
        int opr = sc.nextInt();
        switch (opr) {
            case 1:
                int height,base;
                System.out.print("Enter the Height: ");
                height = sc.nextInt();
                System.out.print("Enter the base: ");
                base = sc.nextInt();
                System.out.println("Area of Right Triangle: "+(1/2*(height*base)));
                break;
            case 2:
                float area;
                System.out.print("Enter the sides");
                area = sc.nextFloat();
                System.out.println("Area of Equilateral Triangle: "+(1.73/4)*(area*area));
                break;
            case 3:
                int side;
                System.out.println("Enter the side: ");
                side = sc.nextInt();
                System.out.println("Area of Square: "+(side*side));
                break;
            case 4:
                int len,width;
                System.out.print("Enter the length: ");
                len = sc.nextInt();
                System.out.print("Enter the width: ");
                width = sc.nextInt();
                System.out.println("Area of Rectangle: "+len*width);
                break;
            case 5:
                int radius;
                System.out.println("Enter the radius: ");
                radius = sc.nextInt();
                System.out.println("Area of Circle: "+3.14*radius*radius);
                break;
            default:
                System.out.println("Please enter valid Operator!!");
                break;
        }
        sc.close();
    }
}

