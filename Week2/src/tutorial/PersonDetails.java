package tutorial;

class Person{
	String name;
	int age;
}

class Employee extends Person{
	int employeeId;
	
	
	Employee(String name, int age, int employeeId) {
		super.name = name;
		super.age = age;
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee[Name: " + name + ", Age: " + age + ", EmployeeId: " + employeeId +"]";
	}
	 
}

public class PersonDetails {

	public static void main(String[] args) {
		Employee e1 = new Employee("Kamal", 20, 1);
		System.out.println(e1);
	}

}
