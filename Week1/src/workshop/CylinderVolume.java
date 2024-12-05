package workshop;

import java.util.Scanner;
import java.lang.Math;
public class CylinderVolume {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder: ");
		double radius = in.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
		double height = in.nextDouble();
		double volume = Math.PI * radius * radius * height;
		System.out.print("Volume of the cylinder is: " + volume);
		in.close();
	}

}
