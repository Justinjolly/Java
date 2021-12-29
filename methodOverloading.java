/*******************************************
 * File    : methodOverloading.java
 * Program : To perform  method Overloading
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 10-12-2021
 *******************************************/
import java.util.Scanner;
class Area{
	void area(float base,float height) {
		float triangle = (base*height)/2;
		System.out.println("Area of triangle: "+triangle);
	}
	void area(int length,int breadth) {
		int rectangle = length *breadth ;
		System.out.println("Area of Rectangle: "+rectangle);
	}
	void area(double radius) {
		double circle = 3.14*radius*radius;
		System.out.println("Area of Circle: "+circle);
	}
}
public class methodOverloading {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		Area r =new Area();
		System.out.println("Enter the height of triangle: ");
		float height = SC.nextFloat();
		System.out.println("Enter the base of triangle:");
		float base = SC.nextFloat();
		r.area(base,height);
		System.out.println("Enter the length of rectangle: ");
		int length = SC.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		int breadth = SC.nextInt();
		r.area(length, breadth);
		System.out.println("Enter the radius of circle: ");
		float radius = SC.nextFloat();
		r.area(radius);
		SC.close();
	}

}
