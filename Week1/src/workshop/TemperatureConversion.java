package workshop;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter temperature in celsius: ");
		double celsius = in.nextDouble();
		in.close();
		double fahrenheit = celsius * (9/5) + 32;
		System.out.print("Temperature in fahrenheit is: " + fahrenheit);
	}

}
