package workshop;

import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		double money = in.nextDouble();
		System.out.print("Enter the exchange rate: ");
		double rate = in.nextDouble();
		double exchangedCurrency = money * rate;
		System.out.print("Amount after exchanged is: "+ exchangedCurrency);
		in.close();
	}

}
