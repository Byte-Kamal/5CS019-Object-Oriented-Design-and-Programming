package workshop;
import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the square: ");
		double length = in.nextDouble();
		double area = length * length;
		System.out.println("Area of square with lenght " + length + " is: "+ area);
		in.close();
	}

}
