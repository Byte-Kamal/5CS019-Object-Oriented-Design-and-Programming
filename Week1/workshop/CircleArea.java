package workshop;

import java.util.Scanner;
import java.lang.Math;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius  of the circle: ");
		double radius = in.nextDouble();
		in.close();
		double area = Math.PI * radius * radius;
		System.out.print("Area of circle is: " + area);
	}

}
 