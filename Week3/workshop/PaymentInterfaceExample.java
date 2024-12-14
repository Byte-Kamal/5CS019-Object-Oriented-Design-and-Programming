package workshop;

interface PaymentMethod{
	void processPayment(double amount);
}

class Esewa implements PaymentMethod{

	@Override
	public void processPayment(double amount) {
		System.out.println("Amount Processed on Esewa.");
	}
	
}

class Khalti implements PaymentMethod{
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Amoutn processed on Khalti.");
	}
}

public class PaymentInterfaceExample {

	public static void main(String[] args) {

	}

}
