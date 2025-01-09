package workshop;

class Parent{
	public String name;
	protected String address;
	private int phoneNumber;
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	void displayDetails() {
		System.out.println("Name: " + name + "\nAddress: " + address + "\nPhone Number: "+ phoneNumber);
	}
}

class Child extends Parent{
	Child(String name, String address, int phoneNumber){
		this.name = name;
		this.address = address;
		this.setPhoneNumber(phoneNumber);
	}
}

public class AccessModifierExample {

	public static void main(String[] args) {
		Child c = new Child("Anush", "Lalitpur", 9800000);
		c.displayDetails();
	}

}
