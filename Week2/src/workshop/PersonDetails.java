package workshop;

class Person{
	protected String address;
}

class Employee extends Person{
	String department;
	
	Employee(String address, String department){
		this.address = address;
		this.department = department;
	}
	
	void display() {
		System.out.println("Address: " + address + "\nDepartment: " + department);
		}
}

public class PersonDetails {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Jarankhu", "Help Desk");
		emp1.display();
	}

}
