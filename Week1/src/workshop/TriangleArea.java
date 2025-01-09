package workshop;

import java.util.Scanner;
import java.lang.Math;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first side of triangle: ");
		int firstSide = in.nextInt();
		System.out.print("Enter the second side of triangle: ");
		int secondSide = in.nextInt();
		System.out.print("Enter the third side of triangle: ");
		int thirdSide = in.nextInt();
		double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
		System.out.print("Area of triangle with side " + firstSide + ", " + secondSide + " and " + thirdSide + " is: " + area);
		in.close();
	}

}
