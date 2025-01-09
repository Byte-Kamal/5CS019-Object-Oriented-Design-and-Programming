package workshop;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		double length = in.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		double width = in.nextDouble();
		in.close();
		double perimeter = 2 * (length + width);
		System.out.print("Perimeter of rectangle is: " + perimeter);
	}
}
