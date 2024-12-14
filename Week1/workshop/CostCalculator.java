package workshop;

import java.util.Scanner;

public class CostCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the quantity of items: ");
		int quantity = in.nextInt();
		System.out.print("Enter the price of item: ");
		double price = in.nextDouble();
		double cost = quantity * price;
		System.out.println("Total cost of item is: " + cost);
		in.close();
	}

}
