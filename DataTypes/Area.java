// Write a Java Program to calculate area and pirameter of rectangle.

class Area{
	public static void main(String []args){
		int length = 10;
		int width = 20;

		int area_rec = length*width;
		System.out.println("Area of Rectangle: "+area_rec);

		int area_Pirameter = (length+width) * 2;
		System.out.println("Area of Pirameter: "+area_Pirameter);
	}
}