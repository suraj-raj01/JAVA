/*
Q5. Write a java program that converts Centigrade to Fahrenheit.
Input a degree in Fahrenheit: 212
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/


import java.util.Scanner;
class fifth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float centigrade,fahrenheit;
		System.out.println("Enter the degree in Fahrenheit : ");
		fahrenheit = sc.nextFloat();
		centigrade = (fahrenheit-32f)*5/9f;
		System.out.println(fahrenheit+" Fahrenheit = "+centigrade+" Celsius");
		sc.close();
	}
}