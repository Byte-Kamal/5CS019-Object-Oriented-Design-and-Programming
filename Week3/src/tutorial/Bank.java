package tutorial;


class BankAccount{
	private int accountNumber;
	private double balance;
	
	BankAccount(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	int getAccountNumber() {
		return accountNumber;
	}
	
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount deposit successful.");
		} else {
			System.out.println("Amount can't be negative.");
		}
	}
	
	void withdraw(int amount) {
		if (amount > balance) {
			balance -= amount;
			System.out.println("Amount withdraw successful.");
		} else if (amount < 0){
			System.out.println("Amount can't be nageative");
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(0001, 5000);
		System.out.println("Balance: " + b1.getBalance());
		System.out.println("AccountNumber: " + b1.getAccountNumber());
		b1.withdraw(-500);
	}

}
