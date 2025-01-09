package workshop;

import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter principle: ");
		int principle = in.nextInt();
		System.out.print("Enter rate of interest: ");
		double rate = in.nextDouble();
		System.out.print("Enter time: ");
		double time = in.nextDouble();
		double simpleInterest = (principle * time * rate) / 100;
		System.out.print("Simple Interest is: " + simpleInterest);
		in.close();
	}

}
