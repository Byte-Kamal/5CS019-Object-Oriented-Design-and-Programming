package workshop;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = in.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = in.nextInt();
		in.close();
		
	
		int addition = firstNumber + secondNumber;
		int subtraction = firstNumber - secondNumber;
		int multiplication = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;
		
		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
	}

}
