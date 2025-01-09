package workshop;

import java.util.Scanner;

public class KilometersConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the distance in miles: ");
		double miles = in.nextDouble();
		in.close();
		double kilometers = miles * 1.60934;
		System.out.print("Distanc in kilometer is: "+ kilometers);
	}

}
